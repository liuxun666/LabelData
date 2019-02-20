package com.hualv.bigdata.labeldata.dao;

import com.hualv.bigdata.labeldata.model.LabelDataModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabelDataDao extends JpaRepository<LabelDataModel, Long> {
}
