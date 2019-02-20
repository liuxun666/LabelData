package com.hualv.bigdata.labeldata.controller;

import com.hualv.bigdata.labeldata.dao.LabelDataDao;
import com.hualv.bigdata.labeldata.dao.LabeledDao;
import com.hualv.bigdata.labeldata.model.LabelDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
@RequestMapping("/")
public class LabelDataController  {
    @Autowired
    private LabeledDao labeledDao;
    @Autowired
    private LabelDataDao labelDataDao;
    @RequestMapping("/")
    public String index(Model model) {
        LabelDataModel labelData = labelDataDao.getOne(1L);
        model.addAttribute("labeldata", labelData);

        return "index";
    }
}
