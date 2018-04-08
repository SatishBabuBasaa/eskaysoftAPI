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

@Resource(name = "scheduleResource")
@Path("/api/v1/schedules")
public class ScheduleResource {
	private static Map<Long, Schedule> DB = new HashMap<>();

	private static HashMap<Integer, String> scheduleType = new HashMap<Integer, String>();

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

	static {
		scheduleType.put(100, "Asserts");
		scheduleType.put(101, "Liabilities");
		scheduleType.put(102, "Trading");
		scheduleType.put(102, "Profit & Loss");

		Schedule schedule1 = new Schedule();
		schedule1.setId(new Long(1));
		schedule1.setScheduleIndex(1);
		schedule1.setScheduleName("Wick");
		schedule1.setScheduleType(scheduleType);

		Schedule schedule2 = new Schedule();
		schedule2.setId(new Long(2));
		schedule2.setScheduleIndex(1);
		schedule2.setScheduleName("Harry");
		schedule2.setScheduleType(scheduleType);

		DB.put(schedule1.getId(), schedule1);
		DB.put(schedule2.getId(), schedule2);
	}
}