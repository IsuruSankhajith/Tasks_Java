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
