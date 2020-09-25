package exercise15_7;

import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;

public class TelephoneWordGenerator {

	
	Telephone thisPhone;
	
	public Telephone getThisPhone() {
		return thisPhone;
	}


	public void setThisPhone(Telephone thisPhone) {
		this.thisPhone = thisPhone;
	}

	public void writeWordToFile(int userPhoneNo)  {
		
		if(String.valueOf(userPhoneNo).matches("\\d{7}") == false) {
			throw new IllegalArgumentException("Phone number must be 7 digits");
		}
		
		
		String words = "";
		
		String charIndex;
		
		char [][] phoneNumChar = getNumberCharValues(userPhoneNo); //get each numbers character representations
			
		try (Formatter output = new Formatter("PhoneWords.txt")){
			
		
			for(int i = 1; i < 2187; i++) {
				 
				charIndex = convertToBase3(i);
				
				words = "";
				
				for(int j = 0; j <  phoneNumChar.length; j++) {
				
					
					words += phoneNumChar[j][Integer.parseInt(Character.toString(charIndex.charAt(j)))];
					
				}
				
				output.format("%s%n", words);
			}
										
			}				
		
			catch(IOException | FormatterClosedException fe) {
			
				System.err.println("error writing to file");
			
		}

		
		
	}
	
	/*	Function returns the character representation for integer values  
	 * 	character representations from telephone digits
	 * 	each digit has 3 character representations
	 */	
	public char[][] getNumberCharValues(int phoneNumber) {
		
		char[][] charValues = new char[String.valueOf(phoneNumber).length()][3];
		
		
		for(int i = 0; i < String.valueOf(phoneNumber).length(); i++) {
			
			charValues[i] =  getThisPhone().getMyPhoneNumber()
										   .getDigits()[Integer.parseInt(Character.toString(
												   String.valueOf(phoneNumber).charAt(i)))];
			
		}
		
		return charValues;
		
	}
	
	public String convertToBase3(int num) {
			
		
		   int result = 0 ;
		   
		   int fact = 1;
		   
		    while (num > 0) {
		   
		        result += num % 3 * fact;
		    	
		    	num /= 3;
		    	
		    	fact *= 10;
		       
		        
		      
		    }

		    return String.format("%07d",result); //add leading zeros to result;
		
		
	}
	
	
	/*
	 * method returns an integer value as an array of single integer
	 * digits
	 */
	public int[] retrieveCharIndex(int indices) {
		
		int values_int[] = new int[String.valueOf(indices).length()];
		
		
		for(int i = 0; i < String.valueOf(indices).length(); i++) {
			
			values_int[i] = Integer.parseInt(Character.toString(String.valueOf(indices).charAt(i)));
			
		}
		
		return values_int;
		
		
	}
	
	
	
	
}
