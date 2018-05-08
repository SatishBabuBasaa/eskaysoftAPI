package com.rest.eskaysoftAPI;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.rest.eskaysoftAPI.resource.ScheduleResource;
import com.rest.eskaysoftAPI.resource.SubScheduleResource;

@Component
@ApplicationPath("/api/v1")
public class AppConfig extends ResourceConfig {

	public AppConfig() {
		register(ScheduleResource.class);
		register(SubScheduleResource.class);
		
	}
}
