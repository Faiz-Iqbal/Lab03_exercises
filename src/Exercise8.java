import java.util.Scanner;

/**
 * Week 3, Exercise 8.
 * 
 * @author INSERT YOUR NAME HERE
 */
public class Exercise8 {

	public static void main(String[] args) {
		final double epsilon = 1.0E-20;
		
		double d;
		double r = 1.00;
		
		Scanner keyboard = new Scanner(System.in); 
	    System.out.print("Enter a real number :"); 
	    d = keyboard.nextDouble() ; 
	    
	    long i = 0;
	    
	    while( Math.abs(d/(r*r) - 1.0) > epsilon ) {
	    	r = d/(2*r) + r/2;
	    	System.out.println((i++) + " : " + r );
	    }
	    
	    System.out.println("The square root of " + d + " is " + r ) ;
	    
	    keyboard.close();

	}

}
