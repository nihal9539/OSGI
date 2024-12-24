package com.adobe.aem.guides.wknd.core.models.impl;

import com.adobe.aem.guides.wknd.core.models.Hello;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;


import javax.inject.Inject;

@Model(adaptables = Resource.class,adapters = Hello.class)
public class HelloImpl  implements  Hello{



    @Inject

    String text;
    @Override
    public String getText() {
        return text;
    }
}
