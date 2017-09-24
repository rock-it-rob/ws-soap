package rob.example.ws.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * AdditionRequest is a POJO that represents a SOAP request. It is a JAXB class.
 * 
 * @author Rob Benton
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class AdditionRequest
{
	private int intOne;
	private int intTwo;

	/**
	 * All fields are initialized via get/set methods to be JAXB-compatible.
	 */
	public AdditionRequest()
	{}

	public void setIntOne(int intOne)
	{
		this.intOne = intOne;
	}

	public void setIntTwo(int intTwo)
	{
		this.intTwo = intTwo;
	}

	@XmlElement
	public int getIntOne()
	{
		return this.intOne;
	}

	@XmlElement
	public int getIntTwo()
	{
		return this.intTwo;
	}
}
