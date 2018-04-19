package com.rest.eskaysoftAPI.resource;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.rest.eskaysoftAPI.entity.Schedule;
import com.rest.eskaysoftAPI.entity.SchedulesEntity;
import com.rest.eskaysoftAPI.service.ScheduleService;
import com.rest.eskaysoftAPI.util.util;

@Resource(name = "schedules")
@Path("/schedules")
public class ScheduleResource {
	private static Map<Long, Schedule> DB = new HashMap<>();

	@Autowired
	ScheduleService scheduleService;

	@GET
	@Produces("application/json")
	public SchedulesEntity getAllSchedules() {
		return scheduleService.getSchedules();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Response getScheduleById(@PathParam("id") Long id) throws URISyntaxException {
		Schedule schedule = scheduleService.getScheduleById(id);
		return util.buildResponse(schedule);
	}

	@PUT
	@Path("/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response updateSchedule(@PathParam("id") Long id, Schedule schedule) throws URISyntaxException {
		Schedule temp = DB.get(id);
		if (schedule == null) {
			return Response.status(404).build();
		}

		temp.setId(schedule.getId());
		temp.setScheduleIndex(schedule.getScheduleIndex());
		temp.setScheduleName(schedule.getScheduleName());
		temp.setScheduleType(schedule.getScheduleType());

		DB.put(temp.getId(), temp);
		return Response.status(200).entity(temp).build();
	}

	@DELETE
	@Path("/{id}")
	public Response deleteSchedule(@PathParam("id") Long id) throws URISyntaxException {
		Schedule schedule = DB.get(id);
		if (schedule != null) {
			DB.remove(schedule.getId());
			return Response.status(200).build();
		}
		return Response.status(404).build();
	}

}