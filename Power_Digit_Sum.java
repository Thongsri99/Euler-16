import java.math.*;

public class Power_Digit_Sum {

	public static void main(String[] args) {
		BigInteger one,two;
		long sum = 0L;
		
		//The following will calculate 2 ^ 1000.
		one = new BigInteger("2");
		two = one.pow(1000);
		
		//Converts 2 ^ 1000 into a string
		String number = String.valueOf(two);
		
		for (int i = 0 ; i < number.length(); i++){
			//Need to subtract '0' to get the true value.
			int value = number.charAt(i) - '0';
			sum += value;
		}
		System.out.println(sum);
	}

}
