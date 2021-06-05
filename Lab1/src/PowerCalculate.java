
public class PowerCalculate {
	public static void main(String[] args) {
		int base = 500, exponential = 4;
		long result = 1;
		while (exponential!=0) {
			result = result*base;
			--exponential;
		}
		System.out.println("Result is "+result);
	}

}
