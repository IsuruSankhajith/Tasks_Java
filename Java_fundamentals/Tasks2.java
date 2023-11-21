
import java.util.Scanner;

class Tasks2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        String x = scanner.nextLine();
        int num1 = Integer.parseInt(x);
        
        System.out.print("Enter second number: ");
        String y = scanner.nextLine();
        int num2 = Integer.parseInt(y);
        
        System.out.print("Enter third number: ");
        String z = scanner.nextLine();
        int num3 = Integer.parseInt(z);
        
        if (num1 > num2)
			if (num1 > num3)
			
			System.out.println("Higest Value number is " + num1);
		if (num2 > num1)
			if (num2 > num3)
			
			System.out.println("Higest Value number is " + num2);
		
		if (num3 > num1)
			if (num3 > num2)
			
			System.out.println("Higest Value number is " + num3);

    }
}


