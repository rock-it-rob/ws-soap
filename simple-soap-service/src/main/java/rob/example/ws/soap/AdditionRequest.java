package rob.example.ws.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * AdditionRequest is a POJO that represents a SOAP request. It is a JAXB class.
 * 
 * <p>
 * The xml accessor type is set on this class as "property" which means methods
 * that follow Java bean property convention (get* or is*) will be treated as
 * xml elements.
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

	public int getIntOne()
	{
		return this.intOne;
	}

	public int getIntTwo()
	{
		return this.intTwo;
	}
}
