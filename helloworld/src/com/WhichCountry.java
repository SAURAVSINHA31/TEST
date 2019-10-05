package com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/country")
public class WhichCountry {
	@GET
	@Path("{name}/{country}")
	@Produces("text/html")
	public Response getResultByParsingValues(@PathParam("name") String name,
			@PathParam("country") String country){
		
		String output= "Customer name - "+name+", Country - "+country+"";
		return Response.status(200).entity(output).build();
		
	}
}
