public class Tasks2 {

    public static void main(String[] args) {
        // Example inputs
        int employeeID = 112245;
        char employmentType = 'P'; // C, P, or F
        double hoursWorked = 10.0; // Hours worked during the week
        double hourlyRate = 60.0; // Hourly rate

        // Validate inputs
        if (isValidInput(employeeID, employmentType, hoursWorked, hourlyRate)) {
            // Calculate weekly wages
            double weeklyWages = calculateWeeklyWages(hoursWorked, hourlyRate);

            // Display output
            displayOutput(employeeID, employmentType, hoursWorked, hourlyRate, weeklyWages);
        } else {
            System.out.println("Invalid input. Please check the input parameters.");
        }
    }

    // Function to validate input parameters
    private static boolean isValidInput(int employeeID, char employmentType, double hoursWorked, double hourlyRate) {
        // Additional validation can be added as needed
        return (hoursWorked >= 5 && hoursWorked <= 70) && (hourlyRate >= 25.0 && hourlyRate <= 75.0);
    }

    // Function to calculate weekly wages
    private static double calculateWeeklyWages(double hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;
    }

    // Function to display output
    private static void displayOutput(int employeeID, char employmentType, double hoursWorked, double hourlyRate, double weeklyWages) {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employment Type: " + employmentType);
        System.out.println("Number of Hours Worked: " + hoursWorked + " hours");
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Weekly Wages: $" + weeklyWages);
    }
}
