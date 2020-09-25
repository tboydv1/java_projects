package exercise8_16;

import java.util.Arrays;



public class IntegerSet {

	
	 private int[] digits;
	 private final int MAX_SIZE = 40;
	 private int length;
	
	 public IntegerSet() {
		 
		 digits = new int[MAX_SIZE];
	 }
	
	public void parse(String numbers) {
		
		int index = MAX_SIZE;
		
		if(numbers.length() < MAX_SIZE) {
			
		
		for(int i = 1; i <= numbers.length(); i++) {
				
			this.digits[MAX_SIZE - i] = Character.getNumericValue(numbers.charAt(numbers.length() - i));
			
			}
		}
		else
			System.out.println("Argument must be less than or equal to 40");
		
		length = numbers.length();

		

		
	}
	
	
		
	public void add(IntegerSet addend) {
		int sum = 1;
		int counter = MAX_SIZE - 1;
		int carry = 0; 
		int loop;
		
		if(this.getLength() > addend.getLength())
			loop = this.getLength();
		else 
			loop = addend.getLength();
		
		for(int count = 0; count <= loop; count++) {
			
			sum = (getDigits(counter)+ carry) + addend.getDigits(counter);
			
			if(sum < 10) {
				
				this.setDigits(sum, counter);
				carry = 0;
			}
			else {
				
				this.setDigits(sum % 10, counter);
				carry = sum / 10;
				
			}
		
			counter -= 1;
			
		}
		

		
	}
	
	public void subtract(IntegerSet subtractend) {
		
		int difference = 1;
		int borrow = 0, count = MAX_SIZE - 1;
		int loop;
		
		if(this.getLength() > subtractend.getLength())
			loop = this.getLength();
		else 
			loop = subtractend.getLength();
		
		for(int counter = 0; counter <= loop; counter++) {
			
			difference = this.getDigits(count) - subtractend.getDigits(count);
			
			if(difference < 0)
			{
				
				int check  = count - 1;
				
				while(borrow == 0)
				{
					
					if(this.getDigits(check) > 0) {
					
					this.setDigits(this.getDigits(check)- 1, check); //borrow 1 from next index
					
					borrow = 1 * 10;
						
					}
					else
					{
						this.setDigits(9, check);
					}
					
					check -= 1;
					
				}
				difference = (this.getDigits(count) + borrow) - subtractend.getDigits(count); //add borrow to current index
				
				this.setDigits(difference, count);
				
				
			}
			else 
			{
				this.setDigits(difference, count);
				borrow = 0;
			}
			
			count -= 1;
				
		}
	

		
	}
	public int getDigits(int index) {
		
		if(index >= 0 && index < 40) {
			
			return digits[index];
		}
		else 
			return 0;
		
	}
	
	

	

	public void setDigits(int value, int index) {
		
		if(value < 10 && value >=  0)
			this.digits[index] = value;
	}
	
	public boolean isEqualTo(IntegerSet obj) {
		
		
			if(Arrays.equals(this.digits, obj.digits) == true)
				return true;
		
		return false;
		
	}
	
	public boolean isNotEqualTo(IntegerSet obj) {
		
		if(!(isEqualTo(obj) == true))
			return true;
		
		return false;
	}
	
	public boolean isGreaterThan(IntegerSet obj) {
		String one = "";
		String two = "";
		
		for(int count = 0; count < MAX_SIZE; count++) {
			
			one = one + this.getDigits(count);
			two = two + obj.getDigits(count);
		}
		if(one.equals(two))
			return true;
					
		return false;
	}
	
	public boolean isLessThan(IntegerSet obj) {
		
		String one = "";
		String two = "";
		
		for(int count = 0; count < MAX_SIZE; count++) {
			
			one = one + this.getDigits(count);
			two = two + obj.getDigits(count);
		}
		int value1 = Integer.parseInt(one);
		int value2 = Integer.parseInt(two);
		
		if(value1 < value2)
			return true;
					
		return false;
		
	}
	
	public boolean isGreaterThanOrEqualTo(IntegerSet obj) {
		
		String one = "";
		String two = "";
		
		for(int count = 0; count < MAX_SIZE; count++) {
			
			one = one + this.getDigits(count);
			two = two + obj.getDigits(count);
		}
		int value1 = Integer.parseInt(one);
		int value2 = Integer.parseInt(two);
		
		if(value1 >= value2)
			return true;
		
					
		return false;
	}
	
	public boolean isLessThanOrEqualTo(IntegerSet obj) {
		
		String one = "";
		String two = "";
		
		for(int count = 0; count < MAX_SIZE; count++) {
			
			one = one + this.getDigits(count);
			two = two + obj.getDigits(count);
		}
		int value1 = Integer.parseInt(one);
		int value2 = Integer.parseInt(two);
		
		if(value1 <= value2)
			return true;
		
					
		return false;
	}
	
	@Override
	public String toString() {
		String newValue = " ";
		int count = MAX_SIZE - 1;
		
		for(int j = getLength(); j > 0; j--) {
			
			newValue =  this.digits[count--] + " " + newValue;
			
		}
		return String.format("%s = %s", "Result is ",newValue);
	}
	
	public void setLength(int l) {
		this.length = l;
	}
	public int getLength() {
		return length;
	}
	
	

}
