
public class SwappWithoutTemp {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 220;
		System.out.println("----Before Swap-----");
		System.out.println("First Number is "+num1);
		System.out.println("Second Number is "+num2);
		num1 = num1 - num2;
		num2 = num1 + num2;
		num1 = num2 - num1;
		System.out.println();
		System.out.println();
		System.out.println("First Number is "+num1);
		System.out.println("Second Number is "+num2);
		
	}

}
