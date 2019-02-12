package com.wulala.bgconsole.entity;

import java.util.Date;
import java.util.List;

public class Skill {
    private String id, description, name;
    private int rate;
    private Date createTime, updateTime;

    private List<SkillExample> examples;

    private Developer developer;

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public List<SkillExample> getExamples() {
        return examples;
    }

    public void setExamples(List<SkillExample> examples) {
        this.examples = examples;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", examples=" + examples +
                ", developer=" + developer +
                '}';
    }
}
