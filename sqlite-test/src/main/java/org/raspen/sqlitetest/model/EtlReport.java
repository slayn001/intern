package org.raspen.sqlitetest.model;

import org.raspen.sqlitetest.Utils.State;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class EtlReport {

    private String state;

    public Integer getTransformationErrorNumber() {
        return transformationErrorNumber;
    }

    public void setTransformationErrorNumber(Integer transformationErrorNumber) {
        this.transformationErrorNumber = transformationErrorNumber;
    }

    private Integer transformationErrorNumber; //error field y or n could make boolean?




    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    }

