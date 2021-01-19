package br.com.bb.desafio.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.bb.desafio.dto.ObjetoJsonDTO;
import br.com.bb.desafio.service.ApiBancoMundialService;
//import jdk.internal.org.objectweb.asm.TypeReference;

@Path("/v1/apibancomundial")
@Produces(MediaType.APPLICATION_JSON)
public class ApiBancoMundialResource {

	
	@Inject
	@RestClient
	ApiBancoMundialService service;

//	@GET
//	@Path("/findIndicators/{countryId}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public CompletionStage<ObjetoJsonDTO<DataIndicatorDTO>> findIndicators(@PathParam String countryId) {
//		try {
//						
//			CompletionStage<String> json = service.findIndicatorsByCountryIdAsync("BR");
//			System.out.print("PONTO 2");
//			ObjectMapper mapper = new ObjectMapper();
//			ObjetoJsonDTO<DataIndicatorDTO> response = mapper.readValue(json.toString(), new TypeReference(ObjetoJsonDTO<DataIndicatorDTO>){});
//			//response.getData().stream().forEach(d -> System.out.println(d.getCountry().getValue()));
//			System.out.print(response);
//			return (CompletionStage<ObjetoJsonDTO>) response;
//			
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//
//		return null;
//	}
	
//	@GET
//	@Path("/findIndicatorsAsync/{countryId}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public CompletionStage<ObjetoJsonDTO> findIndicatorsAsync(@PathParam("countryId") String countryId) {
//		System.out.print(service.findIndicatorsByCountryIdAsync(countryId).toString());
//		return service.findIndicatorsByCountryIdAsync(countryId);
//	}
	
	@GET
	@Path("/findIndicators/{countryId}")
	@Produces(MediaType.APPLICATION_JSON)
	public ObjetoJsonDTO findIndicators(@PathParam(value = "countryId") String countryId){

		String json = service.findIndicatorsByCountryId(countryId);
		ObjectMapper mapper = new ObjectMapper();
		ObjetoJsonDTO response;
		try {
			response = mapper.readValue(json, ObjetoJsonDTO.class);
			response.getData().stream().forEach(d -> System.out.println(d.getCountry().getValue()));
			return response;
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(json);
		
		return null;
		
	}
	
	@GET
	@Path("/findCountries")
	@Produces(MediaType.APPLICATION_JSON)
	public ObjetoJsonDTO findCountries() {
		try {
			
			String json = service.findCountries();			
			ObjectMapper mapper = new ObjectMapper();
			ObjetoJsonDTO response = mapper.readValue(json, ObjetoJsonDTO.class);
			
			return response;
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

}