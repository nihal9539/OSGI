package com.adobe.aem.guides.wknd.core.service;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Student Info", description = "Student Details")
public @interface StudentConfiguration {

    @AttributeDefinition(
            name = "Student Name",
            type = AttributeType.STRING,
            description = "Enter Student Name",
            defaultValue = "Nihal"
    )
    public String getName() default "Nihal";

    @AttributeDefinition(
            name = "Student Age",
            type = AttributeType.INTEGER,
            description = "Enter Student Age"
//          defaultValue = "10" // default values for numbers are specified as strings
    )
    int getAge() default 10;

}
