package com.adobe.aem.guides.wknd.core.models.impl;

import com.adobe.aem.guides.wknd.core.service.MyService;
import org.osgi.service.component.annotations.Component;

@Component(service = MyService.class)
public class MyServiceImpl implements MyService {

    @Override
    public String getGreeting(String name) {
        return "Hello, " + name + "! Welcome to AEM.";
    }
}