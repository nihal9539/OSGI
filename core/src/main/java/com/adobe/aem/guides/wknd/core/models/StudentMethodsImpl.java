package com.adobe.aem.guides.wknd.core.models;

import com.adobe.aem.guides.wknd.core.service.StudentConfigMethods;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

@Model(adaptables = SlingHttpServletRequest.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class StudentMethodsImpl {

    @OSGiService
    StudentConfigMethods osgiConfig;

    public String getName(){
        return osgiConfig.getName();
    }
    public int getAge(){
        return osgiConfig.getAge();
    }
}
