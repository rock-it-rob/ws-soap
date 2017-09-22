package rob.example.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * SimpleService is a class holding methods that each represent a SOAP web
 * service.
 * 
 * @author Rob Benton
 */
@WebService
public class Simple
{
	/**
	 * Nothing here but it's required for JAX-WS.
	 */
	public Simple()
	{
	}

	/**
	 * Just a simple method that returns a string message to the caller.
	 * 
	 * @return String message.
	 */
	@WebMethod
	public String hello()
	{
		return "Hello";
	}
}
