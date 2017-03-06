import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi, ft, in, lb;
		
		System.out.print( "Your height (feet only): " );
		ft = keyboard.nextDouble();
		
		System.out.print( "Your height (inches): " );
		in = keyboard.nextDouble();
		
		System.out.print( "Your weight in pounds: " );
		lb = keyboard.nextDouble();
		
		in = (ft * 12) + in;
		kg = lb * 0.453591;
		m = in / 39.3710;
		
		bmi = kg / (m*m);
		
		System.out.println( "Your BMI is " + bmi );
	}
}