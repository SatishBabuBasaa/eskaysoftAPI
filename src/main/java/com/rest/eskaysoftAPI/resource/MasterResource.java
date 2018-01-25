package com.rest.eskaysoftAPI.resource;



import java.net.URISyntaxException;
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

import com.rest.eskaysoftAPI.entity.MasterEntity;
import com.rest.eskaysoftAPI.util.util;
 
@Path("/master")
public class MasterResource
{
    private static Map<Integer, MasterEntity> DB = new HashMap<>();
     
 
    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Response getUserById(@PathParam("id") int id) throws URISyntaxException
    {
    	MasterEntity user = DB.get(id);
    	return util.buildResponse(user);
       
    }
 
    @PUT
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Response updateUser(@PathParam("id") int id, MasterEntity user) throws URISyntaxException
    {
    	MasterEntity temp = DB.get(id);
        if(user == null) {
            return Response.status(404).build();
        }
        temp.setFirstName(user.getFirstName());
        temp.setLastName(user.getLastName());
        DB.put(temp.getId(), temp);
        return Response.status(200).entity(temp).build();
    }
 
    @DELETE
    @Path("/{id}")
    public Response deleteUser(@PathParam("id") int id) throws URISyntaxException {
    	MasterEntity user = DB.get(id);
        if(user != null) {
            DB.remove(user.getId());
            return Response.status(200).build();
        }
        return Response.status(404).build();
    }
     
    static
    {
    	MasterEntity user1 = new MasterEntity();
        user1.setId(1);
        user1.setFirstName("John");
        user1.setLastName("Wick");
        user1.setUri("/user-management/1");
 
        MasterEntity user2 = new MasterEntity();
        user2.setId(2);
        user2.setFirstName("Harry");
        user2.setLastName("Potter");
        user2.setUri("/user-management/2");
         
        DB.put(user1.getId(), user1);
        DB.put(user2.getId(), user2);
    }
}