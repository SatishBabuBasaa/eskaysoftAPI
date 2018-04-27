package com.rest.eskaysoftAPI.resource;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.rest.eskaysoftAPI.domain.SchedulesEntity;

@Resource(name = "subSchedules")
@Path("/subSchedules")
public class SubScheduleResource {

	@GET
	@Produces("application/json")
	public SchedulesEntity getAllSubSchedules() {
		return null;
	}

}
