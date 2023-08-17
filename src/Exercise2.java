import java.util.Scanner;

/**
 * Week 3, Exercise 2.
 * @author INSERT YOUR NAME HERE
 */
public class Exercise2 {

	public static void main(String[] args) {
		// Second order Equation ax^2 + bx + c = 0
		double a = 0;
		double b = 0;
		double c = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for a");
		a = scan.nextDouble();
		
		System.out.println("Enter value for b");
		b = scan.nextDouble();
		
		System.out.println("Enter value for c");
		c = scan.nextDouble();
		
		double delta = (b*b) - (4*a*c);
		System.out.println("Delta = " + delta);
		
		if(delta < 0) {
			System.out.println("Delta is negative, the equation has no real roots !!");
			
		}else if(delta == 0) {
			double x = -b/(2*a);
			System.out.println("Delta is Zero, the equation has 1 real root");
			System.out.println("X1 = X2 = " + x);
			
		}else {
			double x1 = (-b - Math.sqrt(delta)) / (2 * a); //x1 = (-b - √𝑑𝑒𝑙𝑡𝑎 )/(2*a)
			double x2 = (-b + Math.sqrt(delta)) / (2 * a); //

			System.out.println("Delta is Positive, the equation has 2 real roots");
			System.out.println(" X1 = " + x1 + "\n X2 = " + x2); //x2 = (-b + √𝑑𝑒𝑙𝑡𝑎 )/(2*a)
		}
		
	}

}
