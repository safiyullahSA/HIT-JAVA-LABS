
public class AmstrongNumber {
	public static void main(String[] args) {
		int number = 9474, originalNumber , remainder, result = 0;
		originalNumber = number;
		while(originalNumber!=0) {
			remainder = originalNumber%10;
			result += Math.pow(remainder, 3);
			originalNumber = originalNumber/10;
			
		}
		if(number == result) {
			System.out.println(result+ " is a Amstrong Number");
			
		}
		else {
			System.out.println(number+" is not an Amstrong Number");
		}
	}
}
