01) 

public class Tasks2 {
    public static void main(String[] args) {
        // Check if two command-line arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide two floating-point numbers as command-line arguments.");
            return;
        }

        // Parse the command-line arguments as floating-point numbers
        try {
            double number1 = Double.parseDouble(args[0]);
            double number2 = Double.parseDouble(args[1]);

            // Compare the two numbers
            double largerNumber = Math.max(number1, number2);

            // Output the result
            System.out.println("The larger number is: " + largerNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide valid floating-point numbers.");
        }
    }
}

//////////////////////////////////////////////////////////////////////

02)


public class Tasks2{
	public static void main(String args[]){
		double A, p, r;
		
		p = 1000;
		r = 0.5;
		
		A = p*(1+r)*p*(1+r);
		
		System.out.println(A);
		
	}
}

public class CompoundInterest {
    public static void main(String[] args) {
        // Input values
        double principal = 1000; // original amount invested
        double rate = 0.05;     // annual interest rate (5%)
        int years = 5;          // number of years

        // Calculate the amount using the compound interest formula
        double amount = principal * Math.pow(1 + rate, years);

        // Print the result
        System.out.println("Total amount after " + years + " years: $" + amount);
    }
}

03
//////////////////////////////////////////////////////////////////////////

public class Tasks2 {
    public static void main(String[] args) {
        // Check if two command-line arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide two integers as command-line arguments.");
            return;
        }

        // Parse the command-line arguments as integers
        try {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);

            // Calculate distance using Math.min() and Math.max()
            int distance1 = Math.max(number1, number2) - Math.min(number1, number2);

            // Calculate distance using Math.abs()
            int distance2 = Math.abs(number1 - number2);

            // Output the results
            System.out.println("Using Math.min() and Math.max():");
            System.out.println("Distance: " + distance1);

            System.out.println("\nUsing Math.abs():");
            System.out.println("Distance: " + distance2);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide valid integers.");
        }
    }
}


