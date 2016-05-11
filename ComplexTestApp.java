package csci146_ex8_11;

/**
 * @author Benjamin Lipscomb
 * @version 2-18-2016
 */

/**
 * User inputs real and imaginary numbers. They are added and subtracted
 * across values a and b. 
 */

import java.util.Scanner;

public class ComplexTestApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Complex complex = new Complex();
		Complex a = new Complex();
		Complex b = new Complex();

		System.out.println("Enter the real part of complex number a: ");
		double realA = input.nextDouble();
		complex.setRealA(a.real);

		System.out.println("Enter the imaginary part of complex number a: ");
		double imaginaryA = input.nextDouble();
		complex.setImaginaryA(imaginaryA);

		System.out.println("Enter the real part of complex number b: ");
		double realB = input.nextDouble();
		complex.setRealB(b.realB);

		System.out.println("Enter the imaginary part of complex number b: ");
		double imaginaryB = input.nextDouble();
		complex.setImaginaryB(b.imaginaryB);

		System.out.printf(a.toString());
		System.out.printf(b.toString());

	}//end main method

}//end ComplexTestApp class
