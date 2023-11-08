/*
public class Example1{
	public static void main(String args []){
		System.out.println("Hello World");
	}
}


/////////////////////////////////////////////////////////////////////////////

public class Tasks{
	public static void main(String []args){
		System.out.println( 2 + 3 );
		System.out.println( 2 / 3 );
		System.out.println( 2 % 3 );
	}
}


/////////////////////////////////////////////////////////////////////////////

public class Tasks{
	public static void main(String []args){
		System.out.println( -5 + 8 * 6 );
		System.out.println((55-9) % 9);
		System.out.println (20 + (-3*5)/8);
		System.out.println(5 + (15/2) -8* 2 % 3);

	}
}



/////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
public class Tasks{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number  :");
		String userinput = scanner.nextLine();
		
		System.out.println("You entered  :" + userinput);
		
		scanner.close();

	}
}


/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
public class Tasks{
	public static void main(String [] args){
		Scanner x = new Scanner (System.in);
		System.out.print("Enter number  :");
		String userinput = x.nextLine();
		
		Scanner y = new Scanner (System.in);
		System.out.print("Enter number  :");
		String userinput_2 = y.nextLine();
		
		
		System.out.print("You Entered  :" + userinput + userinput_2);
		
	}
}


/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        String userInput = x.nextLine();

        Scanner y = new Scanner(System.in);
        System.out.print("Enter number 2: ");
        String userInput2 = y.nextLine();

        // Parse the user input as integers and add them
        int num1 = Integer.parseInt(userInput);
        int num2 = Integer.parseInt(userInput2);
        int sum = num1 + num2;

        System.out.println("You Entered: " + num1 + " and " + num2);
        System.out.println("Sum: " + sum);
        
        
    }
}
/////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        String userInput = x.nextLine();

        Scanner y = new Scanner(System.in);
        System.out.print("Enter number 2: ");
        String userInput2 = y.nextLine();

        // Parse the user input as integers and add them
        int num1 = Integer.parseInt(userInput);
        int num2 = Integer.parseInt(userInput2);
        int sum = num1 + num2;
        int mines = num1 - num2;
        int mltiply = num1 * num2;
        int devide = num1 / num2;

        System.out.println("You Entered: " + num1 + " and " + num2);
        System.out.println("Sum: " + sum);
        
        System.out.println("mines: " + mines);
        
        System.out.println("mltiply: " + mltiply);
        
        System.out.println("devide: " + devide);
        
    }
}
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
public class Tasks{
	public static void main (String [] args){
	Scanner x = new Scanner(System.in);
	System.out.print("Enter new number :");
	String userinput = x.nextLine();
	
	for(int i =1; i<=10; i++){
		System.out.println( "8"+"x" + i + " "+ "=" + i * 8);
		}
	}
}

/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
public class Tasks{
	public static void main (String [] args){
	Scanner x = new Scanner(System.in);
	System.out.print("Enter new number :");
	String userinput = x.nextLine();
	
	for(int i =1; i<=10; i++){
		System.out.println( "8"+"x" + i + " "+ "=" + i * 8);
		for(int j =1; j < 10; j++){
			System.out.println(j);
			}
		}
	}
}
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String userinput = x.nextLine();

        // Parse the user input to a double
        double num1 = Double.parseDouble(userinput);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num1 + " x " + i + " = " + num1 * i);
        }
    }
}


/////////////////////////////////////////////////////////////////////////////

public class Tasks {
 
    public static void main(String[] args) {
        // Display the characters to form the text "Java" in a specific pattern
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }
}


/////////////////////////////////////////////////////////////////////////////

public class Tasks {
 
    public static void main(String[] args) {
        double x,y,z;
		x = (25.5 * 3.5 - 3.5 * 3.5);
        y= (40.5 - 4.5);
        z= x/y;
        System.out.print("Value :" + z);
    }
}

/////////////////////////////////////////////////////////////////////////////


public class Tasks {
 
    public static void main(String[] args) {
        double x,y,z;
		x =  (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        y= 4.0;
        z= x*y;
        System.out.print("Value :" + z);
    }
}


/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter radius value: ");
        String userInput = x.nextLine();

        double radius = Double.parseDouble(userInput);

        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;

        System.out.println("The area of the circle with radius " + radius + " is: " + area);
        System.out.println("The perimeter of the circle with radius " + radius + " is: " + perimeter);
    }
}


import java.util.Scanner;
public class Tasks{
	public static void main (String [] args){
	Scanner x = new Scanner(System.in);
	System.out.print("Enter radies value :");
	String userinput = x.nextLine();
	
	double num1 = Double.parseDouble(userinput);
	double  r, z , Perimeter;
	r = (num1 * num1) * 22/7;
	Perimeter = 2 * 22/7 *num1;
	
	System.out.println("The area of " + num1 + " is: " + r);
	System.out.println("The Perimeter  of " + num1 + " is: " + Perimeter);
	
	}
}

/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner; 
public class Tasks{
	public static void main(String [] args){
	Scanner x = new Scanner(System.in);
	System.out.print("Enter number :");
	String userinput = x.nextLine();
	
	Scanner y = new Scanner(System.in);
	System.out.print("Enter number :");
	String userinput2 = y.nextLine();
	
	Scanner z = new Scanner(System.in);
	System.out.print("Enter number :");
	String userinput3 = z.nextLine();
	
	int num1 = Integer.parseInt(userinput);
	int num2 = Integer.parseInt(userinput2);
	int num3 = Integer.parseInt(userinput3);
	
	int j, m ,p;
	
	j = (num1 + num2 + num3)/3;
	
	System.out.println("Average is " + j);
	

	}
}

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter number 3: ");
        int num3 = scanner.nextInt();

        int average = (num1 + num2 + num3) / 3;

        System.out.println("Average is " + average);
        
        // Close the scanner to release resources (optional but good practice)
        scanner.close();
    }
}



//14///////////////////////////////////////////////////////////////////////////
 
public class Tasks {
    public static void main(String[] args) {
        int numRows = 13;
        int numCols = 50;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" *");
                }
            }
            if (i % 2 == 0) {
                System.out.println("=");
            } else {
                System.out.println();
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}

//15///////////////////////////////////////////////////////////////////////////


class Tasks {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int n = s.length();
        int[] charIndex = new int[256]; // Assuming ASCII characters

        int maxLength = 0;
        int left = 0; // Left pointer of the sliding window

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the substring, move the left pointer to the right of its last occurrence
            if (charIndex[currentChar] > 0) {
                left = Math.max(left, charIndex[currentChar]);
            }

            charIndex[currentChar] = right + 1; // Update the last index of the character

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

//16///////////////////////////////////////////////////////////////////////////

public class Tasks {
    public static void main(String[] args)
    {
        // Display a pattern to create an ASCII art representation of a simple face
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }
}

*/
//17///////////////////////////////////////////////////////////////////////////




























