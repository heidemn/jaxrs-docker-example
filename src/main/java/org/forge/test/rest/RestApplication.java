package org.forge.test.rest;

import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;
// import javax.ws.rs.Path;
// import javax.ws.rs.core.Response;
// import javax.ws.rs.GET;
// import javax.ws.rs.Produces;

@ApplicationPath("/")
public class RestApplication extends Application {
    public RestApplication() {}

	// @GET
	// @Produces("text/html")
	// public Response doGet() {
	// 	return Response.ok("<a href='/greet'>Hello</a>").build();
	// }
}
