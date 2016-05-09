

/**
 * @author Benjamin Lipscomb
 * @version 25 Feb 2016
 * CSCI146 Algorithmic Design II
 * Dr. Brian Canada
 * Assignment 2
 * 
 * 
 * Test class to illustrate polymorphic behavior at 
 * runtime.
 */

public class RuntimePolymorphismDemo {

	/**
	 * Creates an array of 5 objects that are classes. Each class is given a name that is printed
	 * upon runtime. Checks if the objects are instances of the Speakable interface.
	 * If they aren't it return a message. If they are it will print the toString and speak
	 * methods of all the objects it iterates through.
	 */
	public static void main(String[] args) {

		Speakable[] speakableObjects = new Speakable[5];
		speakableObjects[0] = new Dog("Spike");
		speakableObjects[1] = new Cat("Tom");
		speakableObjects[2] = new Mouse("Jerry");
		speakableObjects[3] = new Fox("Todd");
		speakableObjects[4] = new Computer();


		//Loops through the animals array
		for(Speakable thisObject : speakableObjects)
		{
			/** Checks if the array object is NOT an instance of the Computer class.
			    If so, it will print the name of the class. */
			if (!(thisObject instanceof Computer))
			{
				System.out.printf("%s",thisObject.toString());
			}//end if statement

			/** Polymorphically calling the speak method 
			    for the specific type of animal. */
			System.out.printf("%s%n",thisObject.speak());

		}//end for loop

	}//end main method

}//end RuntimePolymorphism class
