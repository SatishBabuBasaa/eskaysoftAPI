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
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.rest.eskaysoftAPI.dto.PurchaseEntryDTO;
import com.rest.eskaysoftAPI.service.PurchaseEntryService;
import com.rest.eskaysoftAPI.util.util;

/**
 * Resource for Schedules to create/update/get/delete
 * 
 * @author Lavanya
 * @since 7th May, 2018
 */

@Resource(name = "purchaseentry")
@Path("/purchaseentry")
public class PurchaseEntryResource {

	@Autowired
	PurchaseEntryService purchaseEntryService;

	/**
	 * Returns all purchaseentries
	 * 
	 * @return
	 */

	@GET
	@Produces("application/json")
	public Response getAllPurchaseEntry() {
		return util.buildResponse(purchaseEntryService.getPurchaseEntry());
	}

	/**
	 * Return the purchase entry details for given purchseEntryId
	 * 
	 * @param purchaseId
	 * @return
	 * @throws URISyntaxException
	 */
	@GET
	@Path("/{purchaseId}")
	@Produces("application/json")
	public Response getPurchaseById(@PathParam("purchaseId") Long purchaseId) throws URISyntaxException {
		PurchaseEntryDTO purchaseentry = purchaseEntryService.getPurchaseById(purchaseId);
		return util.buildResponse(purchaseentry);
	}

	/**
	 * Creates a purchase entry with given details
	 * 
	 * @param purchase
	 * @return
	 * @throws URISyntaxException
	 */
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response createPurchaseEntry(PurchaseEntryDTO purchaseentry) throws URISyntaxException {
		if (purchaseentry == null) {
			return Response.status(404).build();
		}
		purchaseEntryService.createPurchaseEntry(purchaseentry);
		return Response.status(200).build();
	}

	/**
	 * Update the PurchaseEntry details
	 * 
	 * @param purchaseEntryDTO
	 * @return
	 * @throws URISyntaxException
	 */
	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public Response updatePurchaseEntry(PurchaseEntryDTO purchaseEntryDTO) throws URISyntaxException {
		purchaseEntryDTO = purchaseEntryService.updatePurchaseEntry(purchaseEntryDTO);
		if (purchaseEntryDTO == null) {
			return Response.status(404).build();
		}
		return Response.status(200).build();
	}

	/**
	 * Delete the PurchaseEntry
	 * 
	 * @param purchaseId
	 * @return
	 * @throws URISyntaxException
	 */
	@DELETE
	@Path("/{purchaseId}")
	public Response deletePurchaseEntry(@PathParam("purchaseId") Long purchaseId) throws URISyntaxException {
		PurchaseEntryDTO purchaseEntryDTO = purchaseEntryService.getPurchaseById(purchaseId);
		if (purchaseEntryDTO != null) {
			boolean isDeleted = purchaseEntryService.deletePurchaseEntry(purchaseEntryDTO);
			if (isDeleted) {
				return Response.status(200).build();
			}

		}
		return Response.status(404).build();

	}

}
