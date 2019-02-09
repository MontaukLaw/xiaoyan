package com.wulala.bgconsole.domain.model;

import java.util.Date;

public class Developer {
    private String ID, NAME;
    private int TYPE;
    private Date CREATE_TIME;

    public Date getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(Date CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getTYPE() {
        return TYPE;
    }

    public void setTYPE(int TYPE) {
        this.TYPE = TYPE;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "ID='" + ID + '\'' +
                ", NAME='" + NAME + '\'' +
                ", TYPE=" + TYPE +
                ", CREATE_TIME=" + CREATE_TIME +
                '}';
    }
}
