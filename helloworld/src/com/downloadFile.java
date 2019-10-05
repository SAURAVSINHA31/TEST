package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/download")
public class downloadFile {
	String path = "c:\\tuts\\NPKey.txt";

	

	@GET
	    @Path("/data")
	    @Produces("text/plain")
	    //@Produces("image/png")
	    //@Produces("application/pdf")
	       @Consumes(MediaType.MULTIPART_FORM_DATA)
	    public Response getCustomerDataFile()   {
	    	File file=new File(path);
	        ResponseBuilder rb = Response.ok((Object) file);
	        rb.header("Content-Disposition","attachment; filename=java4sFileFromServer.txt");
	        return rb.build();
	    }
	
}
