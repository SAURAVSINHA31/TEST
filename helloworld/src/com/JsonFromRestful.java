package com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/fromjason")
public class JsonFromRestful {
	
	@GET
	@Path("/{number}")
	@Produces(MediaType.APPLICATION_JSON)
	public userBean produceUserBeanDetailsinJSON(@PathParam("number") int no){
		userBean ub = new userBean();
		ub.setNumber(no);
		ub.setName("SSSS");
		ub.setCountryName("IIIII");
		return ub;
		
	}
}
