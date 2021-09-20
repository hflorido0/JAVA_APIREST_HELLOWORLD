package api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ApiApi {
	
	@GET
	@Path("/helloworld")
	public Response sayHello() {
		return Response.ok("Hello World desde el API REST", MediaType.APPLICATION_JSON).build();
	}
	
	@GET
	@Path("/root")
	public Response sayHello2() {
		return Response.ok("Esta es la root de la API", MediaType.APPLICATION_JSON).build();
	}
}
