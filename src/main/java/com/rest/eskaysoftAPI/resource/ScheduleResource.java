package com.rest.eskaysoftAPI.resource;



import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.rest.eskaysoftAPI.entity.Schedule;
import com.rest.eskaysoftAPI.entity.SchedulesEntity;
import com.rest.eskaysoftAPI.util.util;
 
@Path("/master")
public class ScheduleResource
{
    private static Map<Integer, Schedule> DB = new HashMap<>();
    
    private static HashMap<Integer, String> scheduleType=new HashMap<Integer,String>();  
   
    @GET
    @Produces("application/json")
    public SchedulesEntity getAllUsers() {
    	SchedulesEntity schedules = new SchedulesEntity();
    	schedules.setSchedules(new ArrayList<>(DB.values()));
        return schedules;
    }
 
    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Response getUserById(@PathParam("id") int id) throws URISyntaxException
    {
    	Schedule user = DB.get(id);
    	return util.buildResponse(user);
    }
 
    @PUT
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Response updateUser(@PathParam("id") int id, Schedule user) throws URISyntaxException
    {
    	Schedule temp = DB.get(id);
        if(user == null) {
            return Response.status(404).build();
        }
        
        temp.setId(user.getId());
        temp.setScheduleIndex(user.getScheduleIndex());
        temp.setScheduleName(user.getScheduleName());
        temp.setScheduleType(user.getScheduleType());
        
        DB.put(temp.getId(), temp);
        return Response.status(200).entity(temp).build();
    }
 
    @DELETE
    @Path("/{id}")
    public Response deleteUser(@PathParam("id") int id) throws URISyntaxException {
    	Schedule user = DB.get(id);
        if(user != null) {
            DB.remove(user.getId());
            return Response.status(200).build();
        }
        return Response.status(404).build();
    }
     
    static
    {
    	 scheduleType.put(100,"Asserts");  
    	    scheduleType.put(101,"Liabilities");  
    	    scheduleType.put(102,"Trading"); 
    	    scheduleType.put(102,"Profit & Loss"); 
    	    
    	    
    	Schedule user1 = new Schedule();
        user1.setId(1);
        user1.setScheduleIndex(1);
        user1.setScheduleName("Wick");
        user1.setScheduleType(scheduleType);
 
        Schedule user2 = new Schedule();
        user2.setId(2);
        user2.setScheduleIndex(1);
        user2.setScheduleName("Harry");
        user2.setScheduleType(scheduleType);
         
        DB.put(user1.getId(), user1);
        DB.put(user2.getId(), user2);
    }
}