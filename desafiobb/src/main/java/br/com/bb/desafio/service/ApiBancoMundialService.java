package br.com.bb.desafio.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@RegisterRestClient(baseUri="http://api.worldbank.org/v2/country/BR/indicator/SI.POV.DDAY?format=json&per_page=24")
public interface ApiBancoMundialService {

//	@GET
//	// @Path("/country/{countryId}/indicator/SI.POV.DDAY?format=json&per_page=24")
//	@Produces(MediaType.APPLICATION_JSON)
//	// @Timeout(value = 50)
//	public CompletionStage<ObjetoJsonDTO> findIndicatorsByCountryIdAsync(@PathParam("countryId") String countryId);

	@GET
	//@Path("/country/{countryId}/indicator/SI.POV.DDAY?format=json&per_page=24")
	@Produces(MediaType.APPLICATION_JSON)
	public String findIndicatorsByCountryId(@PathParam String countryId);

	@GET
	@Path("/country/br?format=json")
	@Produces(MediaType.APPLICATION_JSON)
	public String findCountries();
	
}
