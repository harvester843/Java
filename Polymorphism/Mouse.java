

/**
 * @author Benjamin Lipscomb
 * @version 25 Feb 2016
 *
 * CONCRETE Mouse class extends the Animal superclass.
 * Defines what the Mouse will say when he speaks.
 */

public class Mouse extends Animal {

	/** returns name of dog defined in the superclass */
	public Mouse(String name)
	{
		super(name);
	}//end mouse constructor

	/** Returns what the speak method will display when
	    called by the interface */
	@Override
	public String speak() 
	{
		return "Squeak!";
	}//end speak method

	/** prints string of the superclass */
	public String toString()                                     
	{                                                            
		return String.format(super.toString());
	}// end toString method

}//end concrete class Mouse
