package com.hualv.bigdata.labeldata.dao;

import com.hualv.bigdata.labeldata.model.LabeledModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabeledDao extends JpaRepository<LabeledModel, Long> {
}
