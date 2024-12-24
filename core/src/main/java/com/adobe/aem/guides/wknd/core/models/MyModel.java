package com.adobe.aem.guides.wknd.core.models;

import com.adobe.aem.guides.wknd.core.service.MyService;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.osgi.resource.Resource;

import javax.annotation.PostConstruct;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MyModel {

    @Self
    private Resource resource;

    @OSGiService
    private MyService myService;

    private String greeting;

    @PostConstruct
    protected void init() {
//        greeting = myService.getGreeting(resource.getName());
//        String resourceName = resource.getPath().substring(resource.getPath().lastIndexOf('/') + 1);
//        greeting = myService.getGreeting(resourceName);
    }

    public String getGreeting() {
        return greeting;
    }
}