package com.adobe.aem.guides.wknd.core.models.impl;

import com.adobe.aem.guides.wknd.core.models.Second;
import com.day.cq.wcm.api.Page;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import javax.inject.Inject;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.injectorspecific.RequestAttribute;

@Model(adaptables = SlingHttpServletRequest.class, adapters = Second.class)
public class SecondImpl implements Second {

    @Inject
    @Optional
    private Page pathname;


    @RequestAttribute(name="rAttribute")
    private String requestAttribute;

//    @Override
//    public String getPathName() {
//        return pathname != null ? pathname.getTitle() : "No page available";
//    }

    @Override
    public String getRequestAttribute() {
        return requestAttribute;
    }
}
