package com.progrank.JerseyDemo;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("cities/")
public class CityResource {
	
	CityDAO dao = new CityDAO();
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
	public List<City> getCity() {
		return dao.getAllCity();
	}
	
	@GET
	@Path("/{cityId}")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public City getCityById(@PathParam("cityId") int id) {
		System.out.println("Here is the id:-"+ id);
		return dao.getAllCityById(id);
	}
	
	@DELETE
	@Path("/{cityId}")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public List<City> removeCity(@PathParam("cityId") int id) {
		System.out.println("Here is the id:-"+ id);
		return dao.removeCity(id);
	}
	
	@POST
	@Path("addCity")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public List<City> addCity(City city) {
		return dao.createCity(city);
		
	}
	
	
	
	@PUT
	@Path("upadateCity/{id}")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public List<City> updateCity(@PathParam("id") int cityId,City c){
		return dao.updateCity(cityId,c.getCityName());
	}
	

}
