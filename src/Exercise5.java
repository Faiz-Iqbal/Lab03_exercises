import java.util.Scanner;

/**
 * Week 3, Exercise 5.
 * 
 * @author INSERT YOUR NAME HERE
 */
public class Exercise5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter an integer number: ");
		int num = scan.nextInt();

		// calculate the factorial of n
		long factorial = 1;
		
		if (num > 1) {
			for (int f = num; f > 1; f--) {
				factorial = factorial * f;
			}
		}
		
		System.out.print("Factorial " + num + " = " + factorial);
		scan.close();

	}

}
