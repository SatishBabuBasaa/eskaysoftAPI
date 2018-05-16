package com.rest.eskaysoftAPI;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.rest.eskaysoftAPI.resource.CustomerWiseDiscountsResource;
import com.rest.eskaysoftAPI.resource.DistrictResource;
import com.rest.eskaysoftAPI.resource.ScheduleResource;
import com.rest.eskaysoftAPI.resource.StateResource;

@Component
@ApplicationPath("/api/v1")
public class AppConfig extends ResourceConfig {

	public AppConfig() {
		register(ScheduleResource.class);
		register(CustomerWiseDiscountsResource.class);
		register(StateResource.class);
		register(DistrictResource.class);
	}
}
