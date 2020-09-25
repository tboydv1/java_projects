/**
 * 
 */
package exercise14_8;

import java.util.StringTokenizer;

/**
 * @author tboydev
 *
 */

public class TelephoneNumberTokenizer {

	private String telephoneNumber;

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	public String getAreaCode() {
		
		StringTokenizer tokenizer =  new StringTokenizer(telephoneNumber, " ");
		String areaCode = tokenizer.nextToken();
		//areaCode = areaCode.substring(1, areaCode.length()-1);
		
		String regex = "[^0-9]";
		
		StringBuilder theResult = new StringBuilder();
		
		String[] result = areaCode.split(regex);
		
		for(String number : result) {
			
			theResult.append(number);
		}
		
		return theResult.toString(); 
		
	}
	
	public String[] getOtherNumbers() {
		
		String middleNumber = "";
		
		StringTokenizer tokenizer =  new StringTokenizer(telephoneNumber, " ");
		middleNumber = tokenizer.nextToken();
		middleNumber = tokenizer.nextToken();
		tokenizer = new StringTokenizer(getTelephoneNumber(), "-");
		
		
		String[] middleNumbers = middleNumber.split("-");
		
		
		
		return middleNumbers;
	}
	
	
}
