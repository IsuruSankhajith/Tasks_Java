///////////////////////////////////////////////////////////////////////////
/*

*/




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














































