import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name, location;
		int age;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();
		
		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		// Entering a decimal here will cause a blow up because it requires a whole integer.
		/* Entering a number higher than 2,147,483,647 will cause a blow up due to
		   max integer value. */
		// Entering non-numerical characters will cause a blow up because strings are invalid.
		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();
		// Entering non-numerical characters here will cause a blow up because strings are invalid.
		// Entering a number higher than 1.8E308 here will cause a blow up due to max double value.
		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print("What's your income, " + name + "? " );
		income = keyboard.nextDouble();
		// Entering non-numerical characters here will cause a blow up because strings are invalid.
		// Entering a number higher than 1.8E308 here will cause a blow up due to max double value.
		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		
		System.out.print( "Finally, where do you live, " + name + "? " );
		location = keyboard.next();
		
		System.out.println( location + "? I've heard that place is awful." );
		
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );
		
		// The program does not blow up when you type an integer value when it is expecting
		// a double because all integer values can be entered as a double. 
		
		// The program does not blow up when entering a numeric value when it is expecting
		// a string because numeric values are still a "string of characters"
	}
}