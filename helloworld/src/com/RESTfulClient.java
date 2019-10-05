package com;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RESTfulClient {
	
	public static void main (String[] args){
		
		try {
			Client cl = Client.create();
			WebResource rs = cl.resource("http://localhost:8080/helloworld/download/data");
			ClientResponse clr = rs.accept("application/json").get(ClientResponse.class);
			
			if(clr.getStatus() == 200){
				System.out.println("*****************OUTPUT******************");
				String o = clr.getEntity(String.class);
				System.out.println(o);
			}else if(clr.getStatus() ==500){
				System.out.println("500");
			}
			else{
				System.out.println("Somethiong went wrong"+clr.getStatus());
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
