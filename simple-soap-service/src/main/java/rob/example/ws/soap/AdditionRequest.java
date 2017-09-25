package rob.example.ws.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessOrder;
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
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class AdditionRequest
{
	private int int1;
	private int int2;

	/**
	 * All fields are initialized via get/set methods to be JAXB-compatible.
	 */
	public AdditionRequest()
	{}

	public void setInt1(int int1)
	{
		this.int1 = int1;
	}

	public void setInt2(int int2)
	{
		this.int2 = int2;
	}

	public int getInt1()
	{
		return this.int1;
	}

	public int getInt2()
	{
		return this.int2;
	}
}
