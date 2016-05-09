

/**
 * @author Benjamin Lipscomb
 * @version 25 Feb 2016
 * CSCI146 Algorithmic Design II
 * Dr. Brian Canada
 * Assignment 2
 * 
 * Animal class implements Speakable class. This will get and print the names
 * assigned to the animal subclasses. It will also implement the speak method
 * in the subclasses through the Speakable class. 
 */


/** Because the class Animal is abstract, it will inherit
    all the methods of its Superclass. Defined as abstract class
    because it is not being instantiated. */
public abstract class Animal implements Speakable {

	private final String name; 

	/** Defines the name variable */
	public Animal(String name)
	{
		this.name=name;
	}// end Animal constructor

	/** Gets the name of the animal */
	public String getName()
	{
		return name;
	}// end method getName

	/** Override toString method overrides the toString method in the superclass;
	    returns the string representaion of Animal class */
	@Override
	public String toString()
	{
		return String.format("My name is %s%s", 
				getName(),". " );
	}// end toString method

}//end abstract class animal