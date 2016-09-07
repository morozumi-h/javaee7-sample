package sample.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.ws.rs.QueryParam;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class HelloRequest implements Serializable {

	@QueryParam("a")
	@NotNull
	private String param1;
	@QueryParam("b")
	@NotNull
	private String param2;
}
