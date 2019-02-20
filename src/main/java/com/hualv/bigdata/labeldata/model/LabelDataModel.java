package com.hualv.bigdata.labeldata.model;

import javax.persistence.*;

@Entity(name = "label")
@Table(name = "label")
public class LabelDataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "VARCHAR(2000) COMMENT '文本内容'")
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
