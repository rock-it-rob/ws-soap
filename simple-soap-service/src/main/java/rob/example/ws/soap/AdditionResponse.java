package rob.example.ws.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
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
	private int intOne;
	private int intTwo;
	private int result;

	/**
	 * All fields are initialized through get/set property methods to be JAXB
	 * compatible.
	 */
	public AdditionResponse()
	{}

	public void setIntOne(int intOne)
	{
		this.intOne = intOne;
	}

	public void setIntTwo(int intTwo)
	{
		this.intTwo = intTwo;
	}

	public void setResult(int result)
	{
		this.result = result;
	}

	@XmlElementWrapper(name = "source")
	@XmlElement(name = "int")
	public int[] getRequest()
	{
		return new int[] { this.intOne, this.intTwo };
	}

	@XmlElement
	public int getResult()
	{
		return this.result;
	}
}
