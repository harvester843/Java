package csci146_ex7_17_2D;
/**
 * @author Benjamin Lipscomb
 * @version: 2-18-2016
 * 
 * Rolls 2 sets of die 36,000,000 times. The sum of the numbers rolled
 * is calculated and stored in an array. The percentage of the frequency
 * of numbers that occur are also recorded. Also stores frequency in a 6x6 array
 */

import java.security.SecureRandom;

public class DiceRollingTestApp2D {

	public static void main(String[] args) {

		//create random number generate, die, 1D array and 2D array
		SecureRandom randomNumbers = new SecureRandom();
		int dice1 = 0;				   
		int dice2 = 0;
		int[] frequency = new int[13]; // array of frequency counter
		int[][] array = new int[7][7]; // 2D array of frequency counter

		// roll 2 die 36,000,000 times; use die value as frequency index
		for (int roll = 0; roll <= 36000000; roll++) 
		{
			dice1 =  1+randomNumbers.nextInt(6);
			dice2 =  1+randomNumbers.nextInt(6);
			++frequency[dice1+dice2];
			++array[dice1][dice2];	
		}//end for loop

		// output each 2D array element's values
		for (int sum = 1; sum < array.length; sum++)

			System.out.printf("\t\t\t\t\t\t\n", array[dice1][dice2],array[dice1][dice2],array[dice1][dice2],
					array[dice1][dice2],array[dice1][dice2],array[dice1][dice2]);

		System.out.printf("\t1" +"\t2" +"\t3"+ "\t4" +"\t5" +"\t6"+ "\n");
		
		//outputs the rows and columns of the 2D array
		for(int row = 1; row < array.length; row++)
		{
			System.out.print(row + " \t");

			for(int column = 1; column < array[row].length; column++){

				System.out.printf(array[row][column]+ "\t");

			}//end inner for loop

			System.out.println("\t");

		}//end outer for loop

		System.out.printf("%s%12s%12s%n", "Sum", "Frequency", "Percentage");

		// output each 1D array element's value
		for (int sum = 2; sum < frequency.length; ++sum){

			System.out.printf("%4d%10d%13d%n", sum, frequency[sum], (100*frequency[sum]/36000000));

		} //end for loop


	} //end method main

}//end class DiceRollingTestApp2D

