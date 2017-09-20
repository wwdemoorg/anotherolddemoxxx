package application.rest.v1;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.*;


@Path("hello")
public class Example {
 @GET
 public String greet() throws Exception {
   return "Hello V4 from " + java.net.InetAddress.getLocalHost().getHostName();
 }
}

