

/**
 * @author Benjamin Lipscomb
 * @version 25 Feb 2016
 * CSCI146 Algorithmic Design II
 * Dr. Brian Canada
 * Assignment 2
 * 
 * CONCRETE Fox class extends the Animal superclass.
 * Defines what the Fox will say when he speaks.
 */

public class Fox extends Animal {

	/** returns name of fox defined in the superclass */
	public Fox(String name)
	{
		super(name);
	}//end Fox constructor

	/** Returns what the speak method will display when
	    called by the interface */
	@Override
	public String speak() 
	{
		return "Ring-ding-ding-ding-dingeringeding!!!";
	}//end speak method

	/** prints string of the superclass */
	public String toString()                                     
	{                                                            
		return String.format(super.toString());
	}//end toString method

}//end concrete class Fox
