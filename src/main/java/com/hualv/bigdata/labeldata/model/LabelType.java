package com.hualv.bigdata.labeldata.model;


import javax.persistence.*;

@Entity
public class LabelType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "VARCHAR(20) COMMENT '标记的类型名称'")
    private String labelName;
    @Column(columnDefinition = "VARCHAR(2000) COMMENT '标记类型选项的id，逗号分隔'")
    private String optionIds;
    @Column(columnDefinition = "int default 0 COMMENT '标记类型的状态,0：正常'")
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getOptionIds() {
        return optionIds;
    }

    public void setOptionIds(String optionIds) {
        this.optionIds = optionIds;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
