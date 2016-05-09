package caesar;

import java.util.*;
import java.util.regex.Pattern;

public class Caesar {

	/**
	 * 
	 * @author: Benjamin Lipscomb
	 * @version: 7 May 2016
	 * 
	 * Input: The user is prompted to enter a message they want to encrypt.
	 * Then define two keys that will be the two cipher shift values. 
	 *           
	 * Output: The program will return an encrypted message using the two 
	 * specified keys. The program will also decrypt the message.
	 *           
	 * Process: The program uses a for loop to convert the entered message
	 * to a character array. Shift values are created and applied to the 
	 * characters. If the index is a multiple of 2 then the character at that
	 * index will be the second shift value. 
	 */

	public static String masterKey(String messageToEncrypt, int keyValue, int keyValueTwo) {

		String message = "";

		for (int i = 0; i < messageToEncrypt.length(); i++) {
			char letter = messageToEncrypt.charAt(i);
			int keyOneShift = (letter + keyValue);
			int keyTwoShift = (letter + keyValueTwo);
			char shiftedLetter = (char) keyOneShift;
			char shiftedLetterTwo = (char) keyTwoShift;
			char[] patternCharArray = messageToEncrypt.toCharArray();
			char[] patternArray = new char[patternCharArray.length];
			char array = patternArray[i];

			if (i % 2 == 0) {
				array = shiftedLetterTwo;
			} else
				array = shiftedLetter;

			message += array;
		}
		return message;
	}

	// Encrypts the message
	public static String encrypt(String message, int keyValue, int keyValueTwo) {
		String encryptedMessage = masterKey(message, keyValue, keyValueTwo);
		return encryptedMessage;
	}

	// Decrypts the encrypted string
	public static String decrypt(String messageToEncrypt, int keyValue, int keyValueTwo) {
		int decryptMessage = ((-1) * keyValue);
		int decryptMessageTwo = ((-1) * keyValueTwo);
		String decryptedMessage = masterKey(messageToEncrypt, decryptMessage, decryptMessageTwo);
		return decryptedMessage;
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the message you want to encrypt: ");
		String message = input.nextLine();

		System.out.println("Enter the Key: ");
		int keyValue = input.nextInt();

		System.out.println("Enter the Second Key: ");
		int keyValueTwo = input.nextInt();

		int decryptValue = keyValue;
		String fullEncryption = encrypt(message, keyValue, keyValueTwo);
		String decrypted = decrypt(fullEncryption, decryptValue, keyValueTwo);
		System.out.println("The ecrypted message is: " + fullEncryption);
		System.out.println("The decrypted message is: " + decrypted);
	}// end method Main
}// end class Caesar