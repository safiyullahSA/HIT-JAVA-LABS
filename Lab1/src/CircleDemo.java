import java.util.Scanner;

public class CircleDemo {
	public static void main(String[] args) {
		System.out.print("Enter the radius: ");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		//Area = PI*radius*radius
		double area = Math.PI * (radius * radius);
		System.out.println("The area of circle is: " + area);
		//Circumference = 2*PI*radius
		double circumference= Math.PI * 2*radius;
		System.out.println( "The circumference of the circle is:"+circumference) ;
		sc.close();
		
	}
}
