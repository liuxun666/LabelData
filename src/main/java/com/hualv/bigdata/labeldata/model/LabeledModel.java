package com.hualv.bigdata.labeldata.model;


import javax.persistence.*;

@Entity(name = "labeled")
@Table(name = "labeled")
public class LabeledModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "int COMMENT '文本ID'")
    private Integer contentId;
    @Column(columnDefinition = "int COMMENT '情感类别'")
    private Integer emotionId;
    @Column(columnDefinition = "int COMMENT '特征分类'")
    private Integer categoryId;
    @Column(columnDefinition = "varchar(2000) COMMENT '包含的实体'")
    private String entity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getEmotionId() {
        return emotionId;
    }

    public void setEmotionId(Integer emotionId) {
        this.emotionId = emotionId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

}
