package org.forge.test.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.util.Date;

@Path("/")
public class IndexService {

	@GET
	@Produces("text/html")
	public Response doGet() {
		return Response.ok("<a href='/greet'>Hello</a>").build();
	}
}
