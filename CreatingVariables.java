public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, z, age;
		double seconds, e, checking, distance;
		String firstName, lastName, title, location, date;
		
		x = 10;
		y = 400;
		z = 8000;
		age = 39;
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		distance = 30.9;
		
		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		location = "Colorado";
		date = "March 4, 2017";
		
		System.out.println( "The variable x contains " + x);
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + lastName );
		System.out.println( "The variable z is " + z );
		System.out.println( "We will leave " + date + " and drive " + distance + " miles to " + location );
	}
}