package sample.resources;

import java.util.Arrays;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import sample.logic.HelloLogic;
import sample.request.HelloRequest;
import sample.response.HelloResponse;


@Path("hello")
public class HelloResource {

	@GET
	@Path("world")
	public String helloworld(){
		return "world";
	}
	
	@GET
	@Path("hello2")
	public String hello2(@Valid @BeanParam HelloRequest params){
		System.out.println(params);
		return "hello2";
	}
	
	@GET
	@Path("hello3")
	@Produces(MediaType.APPLICATION_JSON)
	public HelloResponse hello3(){
		return new HelloResponse("a", "b", Arrays.asList("c"));
	}
	
	@Inject
	HelloLogic logic;
	
	@GET
	@Path("hello4")
	public String hello4(@QueryParam("name") String name){
		System.out.println(this);
		System.out.println(logic);
		return logic.message(name);
	}
}
