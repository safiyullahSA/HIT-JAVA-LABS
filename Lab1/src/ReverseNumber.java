import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 0, reverseNum = 0;
		System.out.println("Input your number");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		while(num!=0) {
			reverseNum = reverseNum * 10;
			reverseNum = reverseNum + num%10;
			num = num/10;
			
		}
	scan.close();
	System.out.println("The Given Number Is Now Reversed to "+reverseNum);
	}
	
}
