package csci146_ex8_4;

/**
 * @author Benjamin Lipscomb
 * @version 2-19-2016
 * CSCI146 Algorithm Design II
 * Assignment 1
 * Dr. Brian Canada
 */

/**
 * Creates the rectangle and prompts user for rectangle specifications. .
 */

import java.util.Scanner;

public class RectangleTestApp {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();

		Scanner recScan = new Scanner(System.in);

		// will test if the length or width entered is within the bounds of the exception
		try{
			System.out.println("Enter the length of the rectangle: ");
			double length = recScan.nextDouble();

			rectangle.setLength(length);

			System.out.println("Enter the width of the rectangle: ");

			double width = recScan.nextDouble();

			rectangle.setWidth(width);

			System.out.println(rectangle.toString());
		}//end try statement

		catch (IllegalArgumentException argExcep) 
		{
			System.out.printf("Exeception: %s\n", argExcep.getMessage());

		}//end catch statement

	}//end method main
	
}//end class RectangleTestApp
