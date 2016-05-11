package csci146_ex8_4;

/**
 * @author Benjamin Lipscomb
 * @version 2-19-2016
 */

/**
 * Defines the user input elements which measure the properties of a rectangle.
 */

public class Rectangle 
{
	private double length;
	private double width;

	public Rectangle() 
	{

	}//end no argument constructor

	public Rectangle(double length, double width) 
	{
		setLength(length);
		setWidth(width);
	}//end two argument constructor

	//sets the length of the rectangle, also checks if the width entered falls
    //within the acceptable range
	public void setLength(double length)
	{   
		//will throw exception if the length is below 0 or above 20
		if (length < 0.0 || length > 20.0)
		{
			throw new IllegalArgumentException("The length and width must be between 0.0 and 20.0");
		}//end if statement

		this.length = length;
	}//end setLength method

	//sets the width of the rectangle, also checks if the width entered falls
	//within the acceptable range
	public void setWidth(double width)
	{
		//will throw exception if the width is below 0 or above 20
		if (width < 0.0 || width > 20.0)	
		{
			throw new IllegalArgumentException("The length and width must be between 0.0 and 20.0");
		}//end if statement

		this.width = width; 
	}//end setWidth method

	//gets the length of the rectangle
	public double getLength()
	{
		return length;
	}//end getLength method

	//gets the width of the rectangle
	public double getWidth()
	{
		return width;
	}//end getWidth method

	//determines the perimeter of the rectangle
	public double perimeter()
	{
		return 2 * length + 2 * width;
	}//end perimeter method

	//defines area of the rectangle
	public double area()
	{
		return length*width;
	}//end area method

	//prints message when an exception occurs
	public void IllegalArgumentException(String message){

		System.out.println(message); 
	}//end IllegalArgumentException method

	//inserts user input into a string
	public String toString()
	{
		return ("Length: " +length + "\n"+ "Width: "+width+"\n"
				+"Perimeter: "+perimeter()+"\n"+"Area: "+area());
	}//end toString method
	
}//end class Rectangle
