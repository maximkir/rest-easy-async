package rest.easy.async.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import java.util.concurrent.TimeUnit;

@Path("/resource")
public class MyResource {

    @GET
    @Path("/hello")
    @Produces("text/plain")
    public String hello(){
        return "hello";
    }


    @GET
    @Path("/handle")
    @Produces("text/plain")
    public void handle(@Suspended final AsyncResponse response){
        response.setTimeout(10, TimeUnit.SECONDS);
    }
}
