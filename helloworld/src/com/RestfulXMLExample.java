package com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("/xmltest")
public class RestfulXMLExample {
 
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public userBeanXML getCustomerDetails(@PathParam("id") int custId) {
        
        
     // WRITE DATABASE LOGIC TO RETRIEVE THE CUSTOMER RECORD WITH 'custID'
        
    	userBeanXML cust = new userBeanXML();
        cust.setName("Java4s");
        cust.setCountryName("USA");
        cust.setNumber(custId);
 
        return cust;        
     }
}
