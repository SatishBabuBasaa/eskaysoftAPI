package com.rest.eskaysoftAPI.resource;

import java.net.URISyntaxException;
import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.rest.eskaysoftAPI.domain.Schedule;
import com.rest.eskaysoftAPI.domain.SchedulesEntity;
import com.rest.eskaysoftAPI.service.ScheduleService;
import com.rest.eskaysoftAPI.util.util;

@Resource(name = "schedules")
@Path("/schedules")
public class ScheduleResource {

	@Autowired
	ScheduleService scheduleService;

	@GET
	@Produces("application/json")
	public SchedulesEntity getAllSchedule() {
		return scheduleService.getSchedules();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Response getScheduleById(@PathParam("id") Long id) throws URISyntaxException {
		Schedule schedule = scheduleService.getScheduleById(id);
		return util.buildResponse(schedule);
	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response createSchedule(Schedule schedule) throws URISyntaxException {
		if (schedule == null) {
			return Response.status(404).build();	
		}
		scheduleService.createSchedule(schedule);
		return Response.status(200).build();
	}
	
	@DELETE
	@Path("/{id}")
	public Response deleteSchedule(@PathParam("id") Long id) throws URISyntaxException {
		/*if (schedule != null) {
			return Response.status(200).build();
		}*/
		return Response.status(404).build();
	}

}
