package org.training.capital.microservice.spring20241209;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;


public class Car {


    private String  name;
    private String  model;
    private Integer year;

    public void go() {
        System.out.println("Araba gidiyor");
        name = "osman";
    }

    public String getName() {
        return name;
    }

    public void setName(final String nameParam) {
        name = nameParam;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String modelParam) {
        model = modelParam;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(final Integer yearParam) {
        year = yearParam;
    }
}
