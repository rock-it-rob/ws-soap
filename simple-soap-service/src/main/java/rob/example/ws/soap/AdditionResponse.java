package rob.example.ws.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * AdditionResponse is a POJO that serves as a response object for a SOAP
 * service. It is a JAXB class.
 * 
 * @author Rob Benton
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class AdditionResponse
{
	private AdditionRequest additionRequest;

	private int result;

	/**
	 * All fields are initialized through get/set property methods to be JAXB
	 * compatible.
	 */
	public AdditionResponse()
	{}

	public void setAdditionRequest(AdditionRequest additionRequest)
	{
		this.additionRequest = additionRequest;
	}

	public void setResult(int result)
	{
		this.result = result;
	}

	@XmlElement(name = "source")
	public AdditionRequest getAdditionRequest()
	{
		return this.additionRequest;
	}

	@XmlElement
	public int getResult()
	{
		return this.result;
	}
}
