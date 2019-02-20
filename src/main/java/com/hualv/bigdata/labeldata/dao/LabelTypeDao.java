package com.hualv.bigdata.labeldata.dao;

import com.hualv.bigdata.labeldata.model.LabelType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LabelTypeDao extends JpaRepository<LabelType, Long> {
    public List<LabelType> findByStatus(Integer status);
}
