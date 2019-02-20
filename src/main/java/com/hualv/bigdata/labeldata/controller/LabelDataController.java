package com.hualv.bigdata.labeldata.controller;

import com.hualv.bigdata.labeldata.dao.LabelDataDao;
import com.hualv.bigdata.labeldata.dao.LabelTypeDao;
import com.hualv.bigdata.labeldata.dao.LabeledDao;
import com.hualv.bigdata.labeldata.dao.OptionDao;
import com.hualv.bigdata.labeldata.model.LabelDataModel;
import com.hualv.bigdata.labeldata.model.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@EnableAutoConfiguration
@RequestMapping("/")
public class LabelDataController  {
    @Autowired
    private LabeledDao labeledDao;
    @Autowired
    private LabelDataDao labelDataDao;
    @Autowired
    private LabelTypeDao labelTypeDao;
    @Autowired
    private OptionDao optionDao;
    @RequestMapping("/")
    public String index(Model model) {
        LabelDataModel labelData = labelDataDao.getOne(1L);
        model.addAttribute("data", labelData);

        return "index";
    }

    public void loadLabels() {
        labelTypeDao.findByStatus(0).stream().map(type -> {
            for (String optionId : type.getOptionIds().split(",")) {
                Optional<Option> option = optionDao.findById((long) Integer.parseInt(optionId));
                if(option.isPresent()){
                    Option op = option.get();
                }
            }
        });
    }
}
