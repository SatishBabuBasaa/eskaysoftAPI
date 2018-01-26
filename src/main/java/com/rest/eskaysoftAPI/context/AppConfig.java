package com.rest.eskaysoftAPI.context;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.rest.eskaysoftAPI.resource.ScheduleResource;
 
@Component
public class AppConfig extends ResourceConfig 
{
    public AppConfig() 
    {
        register(ScheduleResource.class);
    }
}

