

/**
 * @author Benjamin Lipscomb
 * @version 25 Feb 2016
 * 
 * CONCRETE Cat class extends the Animal superclass.
 * Defines what the Cat will say when he speaks.
 */
public class Cat extends Animal {

	/** gets the name of the Cat from the superclass. */
	public Cat(String name)
	{
		super(name);
	}//end cat constructor

	/** Returns what the speak method will display when
	    called by the interface */
	@Override
	public String speak() 
	{
		return "Meow!";
	}//end speak method


	/** print string of the superclass */
	
	public String toString()                                     
	{                                                            
		return String.format(super.toString());
	}//end toString method

}//end concrete class Cat
