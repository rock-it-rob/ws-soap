package rob.example.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;

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
	{}

	/**
	 * Just a simple method that returns a string message to the caller.
	 * 
	 * @return String message.
	 */
	@WebMethod
	@WebResult(name = "helloResponse")
	public String hello()
	{
		return "Hello";
	}

	/**
	 * Accepts 2 integers and returns their sum.
	 * 
	 * @param additionRequest
	 * @return sum of the 2 integers passed in.
	 */
	@WebMethod
	@RequestWrapper(className = "rob.example.ws.soap.AdditionRequest")
	@WebResult(name = "additionResponse")
	public AdditionResponse add(@WebParam(name = "intOne") int a, @WebParam(name = "intTwo") int b)
	{
		int result = a + b;
		AdditionResponse additionResponse = new AdditionResponse();
		additionResponse.setIntOne(a);
		additionResponse.setIntTwo(b);
		additionResponse.setResult(result);

		return additionResponse;
	}
}
