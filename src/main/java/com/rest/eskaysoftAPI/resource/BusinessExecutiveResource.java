package com.rest.eskaysoftAPI.resource;

import java.net.URISyntaxException;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.core.Response;
import com.rest.eskaysoftAPI.dto.BusinessExecutiveDTO;
import com.rest.eskaysoftAPI.service.BusinessExecutiveService;
import com.rest.eskaysoftAPI.util.util;

@Resource(name = "businessExecutive")
@Path("/businessExecutive")
public class BusinessExecutiveResource {

	/**
	 * Resource for BusinessExecutive to create/update/get/delete
	 * 
	 * @author SuryaSree
	 * @since 7th May, 2018
	 *
	 */

	@Autowired
	BusinessExecutiveService businessExecutiveService;

	/**
	 * Returns all businessExecutives
	 * 
	 * @return
	 */
	@GET
	@Produces("application/json")
	public Response getAllbusinessExecutives() {
		return util.buildResponse(businessExecutiveService.getbusinessExecutives());
	}

	/**
	 * Return the businessExecutive details for given id
	 * 
	 * @param id
	 * @return
	 * @throws URISyntaxException
	 */
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Response getBusinessExecutivesById(@PathParam("id") Long id) throws URISyntaxException {
		BusinessExecutiveDTO businessExecutive = businessExecutiveService.getBusinessExecutivesById(id);
		return util.buildResponse(businessExecutive);
	}

	/**
	 * Creates a createbusinessExecutive with given details
	 * 
	 * @param businessExecutive
	 * @return
	 * @throws URISyntaxException
	 */
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response createbusinessExecutive(BusinessExecutiveDTO businessExecutive) throws URISyntaxException {
		if (businessExecutive == null) {
			return Response.status(404).build();
		}
		businessExecutiveService.createbusinessExecutive(businessExecutive);
		return Response.status(200).build();
	}

	/**
	 * Update the updatebusinessExecutive details
	 * 
	 * @param businessExecutiveDTO
	 * @return
	 * @throws URISyntaxException
	 */
	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public Response updatebusinessExecutive(BusinessExecutiveDTO businessExecutiveDTO) throws URISyntaxException {
		businessExecutiveDTO = businessExecutiveService.updatebusinessExecutive(businessExecutiveDTO);
		if (businessExecutiveDTO == null) {
			return Response.status(404).build();
		}
		return Response.status(200).build();
	}

	/**
	 * Delete the businessExecutive
	 * 
	 * @param id
	 * @return
	 * @throws URISyntaxException
	 */
	@DELETE
	@Path("/{id}")
	public Response deleteBusinessExecutive(@PathParam("id") Long id) throws URISyntaxException {
		BusinessExecutiveDTO districtDTO = businessExecutiveService.getBusinessExecutivesById(id);
		if (districtDTO != null) {
			boolean isDeleted = businessExecutiveService.deleteBusinessExecutive(districtDTO);

			if (isDeleted) {
				return Response.status(200).build();
			}
		}
		return Response.status(404).build();
	}

}