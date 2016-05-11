

/**
 * @author Benjamin Lipscomb
 * @version 25 Feb 2016
 *
 * CONCRETE Dog class extends the Animal superclass.
 * Defines what the Dog will say when he speaks.
 */

public class Dog extends Animal {

	/** returns name of dog defined in the superclass */
	public Dog(String name)
	{
		super(name);
	}// end Dog constructor

	/** Returns what the speak method will display when
	    called by the interface */
	@Override
	public String speak() 
	{
		return "Woof!";
	}// end speak method

	/** prints string of the superclass */
	public String toString()                                     
	{                                                            
		return String.format(super.toString());
	}//end toString method

}//end concrete class dog
