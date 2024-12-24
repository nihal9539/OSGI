package com.adobe.aem.guides.wknd.core.service;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

//@Component(service = StudentConfigMethods.class)
@Designate(ocd = StudentConfiguration.class)
public class SudentImpl implements StudentConfigMethods {

    private String name;

    private int age;

    @Activate()
    protected void start(StudentConfiguration config) {
        name = config.getName();
        age = config.getAge();


    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
