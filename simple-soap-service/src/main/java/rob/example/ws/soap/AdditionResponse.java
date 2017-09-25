package rob.example.ws.soap;

import java.util.ArrayList;
import java.util.List;

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
	private ArrayList<Integer> source;
	private int result;

	/**
	 * All fields are initialized through get/set property methods to be JAXB
	 * compatible.
	 */
	public AdditionResponse()
	{}

	public void setSource(int intOne, int intTwo)
	{
		this.source = new ArrayList<>();
		this.source.add(intOne);
		this.source.add(intTwo);
	}

	public void setResult(int result)
	{
		this.result = result;
	}

	/**
	 * In this method we use the annotations to control how the output xml is
	 * formed.
	 * 
	 * @return the 2 integers used in the calculation of the result.
	 */
	@XmlElementWrapper(name = "source")
	@XmlElement(name = "int")
	public List<Integer> getSource()
	{
		return this.source;
	}

	public int getResult()
	{
		return this.result;
	}
}
