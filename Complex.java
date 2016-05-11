package csci146_ex8_11;

/**
 * @author Benjamin Lipscomb
 * @version 2-18-2016
 */

/**
 * User inputs real and imaginary numbers. They are added and subtracted
 * across values a and b. 
 */

public class Complex {

	public double real;
	public double imaginary;
	public double imaginaryA;
	public double imaginaryB;
	public double realA;
	public double realB;

	public Complex(){
		//this.real=real;

	}//end Complex

	public Complex(double real, double imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}//end Complex

	public void setImaginaryA(double imaginaryA){
		this.imaginaryA=imaginaryA;
	}//end setImaginaryA method

	public void setImaginaryB(double imaginaryB){
		this.imaginaryB=imaginaryB;
	}//end setImaginaryB method

	public double getImaginaryA(double imaginaryA){
		return imaginaryA;
	}//end getImaginaryA method

	public double getImaginaryB(double imaginaryB){
		return imaginaryB;
	}//end getImaginaryB method



	public void add(double real, double imaginary){
		this.real=real+realB;
		this.imaginary=imaginary+imaginaryB;
	}//end add method

	public double sub(){
		return realA-realB;
	}//end sub method

	public void realPart(double real, double realB){
		a(real);
		b(realB);
	}//end realPart method

	public void a(double real){
		this.real=real;
	}
	public double b(){
		return realB;
	}
	//Complex a = new Complex();
	//Complex b = new Complex();

	public void b(double imaginary){
		this.imaginary=imaginaryB;
	}

	public void imaginaryPart(double imaginary){
		this.imaginary=imaginary;
		this.imaginary=imaginaryB;
	}//end imaginaryPart method

	public void setRealA(double real){
		this.real=real;
	}//end setRealA method

	public void setRealB(double realB){
		this.realB=realB;
	}//end setRealB method

	public double getReal(){
		return real;
	}//end getRealA method

	public double getRealB(){
		return realB;
	}//end getRealB method

	public void setImaginaryPart(double imaginary){
		this.imaginary=imaginary;
	}//end setImaginaryPart method

	public double getRealPart(double real){
		return real;
	}//end getRealPart method

	public double getImaginaryPart(double imaginary){
		return imaginary;
	}//end getImaginaryPart method

	public double addI(){
		return imaginaryA+imaginaryB;
	}//end addI method

	public double subI(){
		return imaginaryA-imaginaryB;
	}//end subI method

	public String toString(){
		return (real+","+imaginary);
	}

	/*public String toString(){
		return ("a=("+this.realA+","+this.imaginaryA+")\n"+"b=("+this.realB+","+this.imaginaryB+")\n"+"a+b=("+add()+","+addI()+")\n"+"a-b=("+sub()+","+subI()+")\n");
	}//end toString method */

}

