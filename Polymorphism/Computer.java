/**
 * @author Benjamin Lipscomb
 * @version 25 Feb 2016
 * CSCI146 Algorithmic Design II
 * Dr. Brian Canada
 * Assignment 2
 * 
 *  Class Computer should not be declared abstract because
 *  the class needs to be instantiated in the RuntimePolymorphismDemo test class
 */

public class Computer implements Speakable {

	/** Returns what the speak method will display when
	    called by the interface */
	public String speak()
	{
		return ("GREETINGS PROFESSOR FALKEN. SHALL WE PLAY A GAME?");	
	}//end concrete method speak

}// end class Computer
