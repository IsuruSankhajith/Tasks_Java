
import java.util.Scanner;

class Tasks2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        String x = scanner.nextLine();
        int num1 = Integer.parseInt(x);  // Corrected method name to parseInt

        if (num1 > 0) {  // Corrected the condition to check if num1 is greater than 0
            System.out.println("Positive number");
        } else {
            System.out.println("Not a positive number");
        }
    }
}

