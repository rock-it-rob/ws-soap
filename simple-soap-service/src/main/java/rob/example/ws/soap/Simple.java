package rob.example.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
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
	@WebResult(name = "additionResponse")
	public AdditionResponse add(@WebParam(name = "additionRequest") AdditionRequest additionRequest)
	{
		int a = additionRequest.getIntOne();
		int b = additionRequest.getIntTwo();
		int result = a + b;
		AdditionResponse additionResponse = new AdditionResponse();
		additionResponse.setAdditionRequest(additionRequest);
		additionResponse.setResult(result);

		return additionResponse;
	}
}
