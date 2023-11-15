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


//17///////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
public class Tasks{
	public static void main(String args []){
	Scanner x = new Scanner(System.in);
	System.out.print("Enter number :");
	String userinput = x.nextLine();
	
	Scanner y = new Scanner(System.in);
	System.out.print("Enter number :");
	String userinput2 = y.nextLine();
	
	int num1 = Integer.parseInt(userinput);
	int num2 = Integer.parseInt(userinput2);
	
	int z;
	
	z = num1 * num2;
	
	System.out.println("Value :" + z);
	
	}
}


import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Input second binary number: ");
        String binary2 = scanner.nextLine();

        String sum = addBinary(binary1, binary2);

        System.out.println("Sum of two binary numbers: " + sum);

        scanner.close();
    }

    public static String addBinary(String binary1, String binary2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int i = binary1.length() - 1;
        int j = binary2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int bit1 = (i >= 0) ? Character.getNumericValue(binary1.charAt(i)) : 0;
            int bit2 = (j >= 0) ? Character.getNumericValue(binary2.charAt(j)) : 0;

            int sum = bit1 + bit2 + carry;
            result.insert(0, sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        return result.toString();
    }
}
----------------
import java.util.Scanner;

public class Exercise17 {
 public static void main(String[] args) {
  // Declare variables to store two binary numbers, an index, and a remainder
  long binary1, binary2;
  int i = 0, remainder = 0;
  
  // Create an array to store the sum of binary digits
  int[] sum = new int[20];
  
  // Create a Scanner object to read input from the user
  Scanner in = new Scanner(System.in);

  // Prompt the user to input the first binary number
  System.out.print("Input first binary number: ");
  binary1 = in.nextLong();
  
  // Prompt the user to input the second binary number
  System.out.print("Input second binary number: ");
  binary2 = in.nextLong();

  // Perform binary addition while there are digits in the binary numbers
  while (binary1 != 0 || binary2 != 0) 
  {
   // Calculate the sum of binary digits and update the remainder
   sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
   remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
   binary1 = binary1 / 10;
   binary2 = binary2 / 10;
  }
  
  // If there is a remaining carry, add it to the sum
  if (remainder != 0) {
   sum[i++] = remainder;
  }
  
  // Decrement the index to prepare for printing
  --i;
  
  // Display the sum of the two binary numbers
  System.out.print("Sum of two binary numbers: ");
  while (i >= 0) {
   System.out.print(sum[i--]);
  }
  
  System.out.print("\n");  
 }
}



//17///////////////////////////////////////////////////////////////////////////
// Importing the Scanner class to take user input
import java.util.Scanner;

// The main class named Tasks
public class Tasks {
    // The main method where the program execution begins
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to input the first binary number
        System.out.print("Input the first binary number: ");
        // Reading the first binary number as a string
        String binary1 = scanner.nextLine();

        // Prompting the user to input the second binary number
        System.out.print("Input the second binary number: ");
        // Reading the second binary number as a string
        String binary2 = scanner.nextLine();

        // Calling the multiplyBinary method to calculate the product of the binary numbers
        String product = multiplyBinary(binary1, binary2);

        // Displaying the product of the two binary numbers
        System.out.println("Product of two binary numbers: " + product);

        // Closing the Scanner to free up resources
        scanner.close();
    }

    // Method to multiply two binary numbers and return the result as a binary string
    public static String multiplyBinary(String binary1, String binary2) {
        // Getting the lengths of the binary numbers
        int len1 = binary1.length();
        int len2 = binary2.length();

        // Array to store the result of multiplication
        int[] result = new int[len1 + len2];

        // Loop to perform binary multiplication
        for (int i = len1 - 1; i >= 0; i--) {
            // Initializing carry for the current bit multiplication
            int carry = 0;
            // Getting the current bit of binary1
            int bit1 = binary1.charAt(i) - '0';

            // Inner loop to multiply the current bit of binary1 with each bit of binary2
            for (int j = len2 - 1; j >= 0; j--) {
                // Getting the current bit of binary2
                int bit2 = binary2.charAt(j) - '0';

                // Calculating the sum of the product, the result bit, and the carry
                int sum = bit1 * bit2 + result[i + j + 1] + carry;

                // Storing the result bit in the result array
                result[i + j + 1] = sum % 2;
                
                // Updating the carry for the next iteration
                carry = sum / 2;
            }

            // Adding the remaining carry to the current bit of binary1
            result[i] += carry;
        }

        // Building a StringBuilder to store the binary product
        StringBuilder productBuilder = new StringBuilder();
        
        // Adding each bit of the result array to the StringBuilder
        for (int value : result) {
            productBuilder.append(value);
        }

        // Removing leading zeros from the binary product
        while (productBuilder.length() > 1 && productBuilder.charAt(0) == '0') {
            productBuilder.deleteCharAt(0);
        }

        // Returning the binary product as a string
        return productBuilder.toString();
    }
}


////-----------------------------------------------------
import java.util.Scanner;
public class Tasks {
 public static void main(String[] args) {
  // Declare variables to store two binary numbers and the product
  long binary1, binary2, multiply = 0;
  
  // Initialize digit and factor variables for processing binary2
  int digit, factor = 1;
  
  // Create a Scanner object to read input from the user
  Scanner in = new Scanner(System.in);
  
  // Prompt the user to input the first binary number
  System.out.print("Input the first binary number: ");
  binary1 = in.nextLong();
  
  // Prompt the user to input the second binary number
  System.out.print("Input the second binary number: ");
  binary2 = in.nextLong();
  
  // Process binary2 to calculate the product
  while (binary2 != 0) {
   digit = (int)(binary2 % 10);
   if (digit == 1) {
    binary1 = binary1 * factor;
    multiply = binaryproduct((int) binary1, (int) multiply);
   } else {
    binary1 = binary1 * factor;
   }
   binary2 = binary2 / 10;
   factor = 10;
  }
  
  // Display the product of the two binary numbers
  System.out.print("Product of two binary numbers: " + multiply + "\n");
 }

 // Method to calculate the product of two binary numbers
 static int binaryproduct(int binary1, int binary2) {
  int i = 0, remainder = 0;
  int[] sum = new int[20];
  int binary_prod_result = 0;

  while (binary1 != 0 || binary2 != 0) {
   sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
   remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
   binary1 = binary1 / 10;
   binary2 = binary2 / 10;
  }

  if (remainder != 0) {
   sum[i++] = remainder;
  }
  
  --i;
  
  while (i >= 0) {
   binary_prod_result = binary_prod_result * 10 + sum[i--];
  }

  return binary_prod_result;
 }
}
 


//18///////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

// The main class named Tasks
public class Tasks {
    // The main method where the program execution begins
    public static void main(String args[]) {
        // Variables to store decimal number, quotient, loop counter, and binary digits
        int dec_num, quot, i = 1, j;
        int bin_num[] = new int[100];

        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompting the user to input a decimal number
        System.out.print("Input a Decimal number : ");
        
        // Reading the decimal number from the user
        dec_num = scanner.nextInt();

        // Storing the decimal number in the quotient variable
        quot = dec_num;

        // Loop to convert decimal to binary
        while (quot != 0) {
            // Storing the remainder (binary digit) in the bin_num array
            bin_num[i++] = quot % 2;
            // Updating the quotient for the next iteration
            quot = quot / 2;
        }

        // Displaying the binary representation of the decimal number
        System.out.print("Binary number is :");

        // Loop to print the binary digits in reverse order
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin_num[j]);
        }

        // Adding a new line for better output formatting
        System.out.print("\n");
    }
}

//19///////////////////////////////////////////////////////////////////////////



import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Input second binary number: ");
        String binary2 = scanner.nextLine();

        String sum = addBinary(binary1, binary2);

        System.out.println("Sum of two binary numbers: " + sum);

        scanner.close();
    }

    public static String addBinary(String binary1, String binary2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int i = binary1.length() - 1;
        int j = binary2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int bit1 = (i >= 0) ? Character.getNumericValue(binary1.charAt(i)) : 0;
            int bit2 = (j >= 0) ? Character.getNumericValue(binary2.charAt(j)) : 0;

            int sum = bit1 + bit2 + carry;
            result.insert(0, sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        return result.toString();
    }
}

//19///////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a decimal number
        System.out.print("Input a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Convert decimal to hexadecimal
        String hexadecimalNumber = convertToHexadecimal(decimalNumber);

        // Display the result
        System.out.println("Hexadecimal number is: " + hexadecimalNumber);
    }

    // Function to convert decimal to hexadecimal
    private static String convertToHexadecimal(int decimalNumber) {
        // Using built-in method to convert decimal to hexadecimal
        String hexadecimal = Integer.toHexString(decimalNumber);

        // Convert the result to uppercase for consistency
        return hexadecimal.toUpperCase();
    }
}


//20///////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Tasks {
    public static void main(String args[]) {
        int dec_num, rem;
        String hexdec_num = "";
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        Scanner in = new Scanner(System.in);

        System.out.print("Input decimal number: ");
        dec_num = in.nextInt();

        while (dec_num > 0) {
            rem = dec_num % 16;
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num / 16;
        }

        System.out.print("Hexadecimal number is: " + hexdec_num + "\n");
    }
}

//21///////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a decimal number
        System.out.print("Input a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Convert decimal to octal
        String octalNumber = convertToOctal(decimalNumber);

        // Display the result
        System.out.println("Octal number is: " + octalNumber);
    }

    // Function to convert decimal to octal
    private static String convertToOctal(int decimalNumber) {
        // Using built-in method to convert decimal to octal
        String octal = Integer.toOctalString(decimalNumber);

        return octal;
    }
}

import java.util.Scanner;

public class Tasks {
    public static void main(String args[]) {
        // Declare variables to store decimal number, remainder, quotient, and an array for octal digits
        int dec_num, rem, quot, i = 1, j;
        int oct_num[] = new int[100];
        
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user to input a decimal number
        System.out.print("Input a Decimal Number: ");
        dec_num = scan.nextInt();

        // Initialize the quotient with the decimal number
        quot = dec_num;

        // Convert the decimal number to octal and store octal digits
        while (quot != 0) {
            oct_num[i++] = quot % 8;
            quot = quot / 8;
        }

        // Display the octal representation of the decimal number
        System.out.print("Octal number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(oct_num[j]);
        }
        
        System.out.print("\n");
    }
}

//22///////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Declare variables to store binary and decimal numbers, remainder, and a multiplier
        long binaryNumber, decimalNumber = 0, j = 1, remainder;
        
        // Prompt the user to input a binary number
        System.out.print("Input a binary number: ");
        binaryNumber = sc.nextLong();

        // Convert the binary number to decimal
        while (binaryNumber != 0) {
            remainder = binaryNumber % 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }
        
        // Display the decimal representation of the binary number
        System.out.println("Decimal Number: " + decimalNumber);
    }
}


//23///////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a Binary Number: ");
        String binaryInput = scanner.next();

        // Convert binary to decimal first
        int decimalValue = Integer.parseInt(binaryInput, 2);

        // Convert decimal to hexadecimal
        String hexadecimalValue = Integer.toHexString(decimalValue);

        System.out.println("Hexadecimal value: " + hexadecimalValue.toUpperCase());
    }
}



 import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        // Declare an array to store hexadecimal digits, variables for calculation, and binary input
        int[] hex = new int[1000];
        int i = 1, j = 0, rem, dec = 0, bin;

        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a binary number
        System.out.print("Input a Binary Number: ");
        bin = in.nextInt();

        // Convert the binary number to decimal
        while (bin > 0) {
            rem = bin % 2;
            dec = dec + rem * i;
            i = i * 2;
            bin = bin / 10;
        }
        i = 0;

        // Convert the decimal number to hexadecimal
        while (dec != 0) {
            hex[i] = dec % 16;
            dec = dec / 16;
            i++;
        }

        // Display the hexadecimal value
        System.out.print("Hexadecimal value: ");
        for (j = i - 1; j >= 0; j--) {
            if (hex[j] > 9) {
                System.out.print((char)(hex[j] + 55));
            } else {
                System.out.print(hex[j]);
            }
        }
        System.out.print("\n");
    }
}

//31///////////////////////////////////////////////////////////////////////////

public class Tasks {
    public static void main(String args[]) {
        System.out.println("\n Java version: " + System.getProperty("java.version"));

        System.out.println("\n Java Runtime Version: " + System.getProperty("java.runtime.version"));

        System.out.println("\n Java Home: " + System.getProperty("java.home"));

        System.out.println("\n Java Vendor: " + System.getProperty("java.vendor"));

        System.out.println("\n Java Vendor URL: " + System.getProperty("java.vendor.url"));

        System.out.println("\n Java Class path: " + System.getProperty("java.class.path"));
    }
}


//32///////////////////////////////////////////////////////////////////////////

public class Tasks{
	public static void main(String [] args){
		int x = 25;
		int y = 39;
		int z;
		
		z = (25 != 39);                                                                          
		System.out.println(z);
	}
}

//32///////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Tasks {
    public static void main(String args[]) {
        // Create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        int number1; // First number to compare
        int number2; // Second number to compare

        // Prompt the user to input the first integer
        System.out.print("Input first integer: ");
        number1 = input.nextInt(); // Read the first number from the user

        // Prompt the user to input the second integer
        System.out.print("Input second integer: ");
        number2 = input.nextInt(); // Read the second number from the user

        // Compare and display the results
        if (number1 == number2)
            System.out.printf("%d == %d\n", number1, number2);
        if (number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);
    }
}
 
//32///////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Integer: ");
        
        long n = input.nextLong();
        
        System.out.println("The sum of the digits is: " + sumDigits(n));
        
        input.close(); // It's good practice to close the Scanner when you're done with it
    }

    public static int sumDigits(long n) {
        int sum = 0;
        
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        
        return sum;
    }
}

 

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");

        int number = input.nextInt();

        // Create an instance of DigitSumCalculator class
        DigitSumCalculator calculator = new DigitSumCalculator();

        // Calculate and display the sum of digits
        int sum = calculator.calculateDigitSum(number);
        System.out.println("The sum of the digits is: " + sum);
    }
}

class DigitSumCalculator {
    // Function to calculate the sum of digits
    public int calculateDigitSum(int number) {
        int sum = 0;

        // Iterate through each digit of the number
        while (number != 0) {
            // Extract the last digit
            int digit = number % 10;

            // Add the digit to the sum
            sum += digit;

            // Remove the last digit from the number
            number /= 10;
        }

        return sum;
    }
}
public class MyFriends {
  public static void main(String args[]) {

    AllMyfriends contacts = new AllMyfriends();

    contacts.add("John","Smith","johnsmith@ecu.edu.au");
    contacts.add("Felix","Finley","felixf@uwa.edu.au");
    contacts.add("Mike","Spelling","mikespe@uow.edu.au");
    contacts.add("Kathy","Ellis","kateellis@usydney.edu.au");
    contacts.add("Debbie","Brown","Dbrowny@umelb.edu.au");

    System.out.println(contacts.toString());
      }
}


//32///////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");

        double sideLength = input.nextDouble();

        // Create an instance of Hexagon class
        Hexagon hexagon = new Hexagon(sideLength);

        // Calculate and display the area of the hexagon
        double area = hexagon.calculateArea();
        System.out.println("The area of the hexagon is: " + area);
    }
}

class Hexagon {
    private double sideLength;

    // Constructor to initialize the side length
    public Hexagon(double sideLength) {
        this.sideLength = sideLength;
    }

    // Getter for side length
    public double getSideLength() {
        return sideLength;
    }

    // Function to calculate the area of the hexagon
    public double calculateArea() {
        // Using the formula: (6 * s^2)/(4 * tan(π/6))
        return (6 * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / 6));
    }
}


//32///////////////////////////////////////////////////////////////////////////
public class Tasks {
	
	private final int DEFAULT_MAX_FRIENDS = 10;	// default size of array
	

	private Person[] friendList;		// array of persons (list of friends)
	private int numFriends;				// current number of persons in list
	
	
	public Tasks() {
		friendList = new Person[DEFAULT_MAX_FRIENDS];
		numFriends = 0;
	}
	

	public Tasks(int max) {
		friendList = new Person[max];
		numFriends = 0;
	}

	
	public void add(String firstName, String lastName, String email) {
		// create a new Person object
		Person friend = new Person(firstName, lastName, email);
				
		// add it to the array of friends
		// if the array is not big enough, double its capacity automatically
		if (numFriends == friendList.length)
			expandCapacity();
		
		// add a reference to a friend at the first free spot in the array
		friendList[numFriends] = friend;
		numFriends++;		
	}

	
	public boolean remove(String firstName, String lastName) {
		final int NOT_FOUND = -1;
		int search = NOT_FOUND;
		Person target = new Person(firstName, lastName, "");	

		// if the list is empty, can't remove
		if (numFriends == 0) {
			return false;
		}
		// search the list for the specified friend
		for (int i = 0; i < numFriends && search == NOT_FOUND; i++)
			if (friendList[i].equals(target))
				search = i;
		
		// if not found, can't remove 
		if (search == NOT_FOUND)
			return false;
		
		// the target person is found, remove by replacing with the last one in the list
		friendList[search] = friendList[numFriends - 1];
		friendList[numFriends - 1] = null;
		numFriends--;
		
		return true;			
	}
		
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < numFriends; i++) {
			s.append(friendList[i].toString()).append("\n");
		}
		return s.toString();
	}
	
	
	private void expandCapacity() {
		Person[] largerList = new Person[friendList.length * 2];
		System.arraycopy(friendList, 0, largerList, 0, friendList.length);
		friendList = largerList;
	}
}

/**
 * Class that represents a person with attributes name, email address 
 
 *
 */
public class Tasks {
	
	/* Attribute declarations */
	private String lastName;	// last name
	private String firstName;	// first name
	private String email;		// email address
			
	/**
	 * Constructor initializes the person's name and email address
	 */
	public Person(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;		
		this.email = email;
	}

	/**
	 * getName method returns the person's full name
	 * @return first name followed by last name, blank separated
	 */
	public String getName(){
		return firstName + " " + lastName;
	}
	
	/**
	 * getEmail method returns the person's email address
	 * @return email address
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * setEmail method sets the person's email address
	 * @param email
	 */
	public void setEmail (String email) {
		this.email = email;
	}
	
	/**
	 * equals method determines whether two persons have the same name
	 * @param other	other Person object that this is compared to
	 * @return true of they have the same first name and last name, false otherwise
	 */
	public boolean equals(Person other){
		if (this.firstName.equals(other.firstName)&& this.lastName.equals(other.lastName))
			return true;
		else
			return false;
	}

	/**
	 * toString method returns a string representation of the person
	 * @return string with first name and last name, email address 
	 */
	public String toString() {
		String s = firstName + " " + lastName + "\t" + email;
		return s;
	}
}



*/
/**
 * Class that represents a person with attributes name, email address 
 
 *
 */
public class Tasks {
	
	/* Attribute declarations */
	private String lastName;	// last name
	private String firstName;	// first name
	private String email;		// email address
			
	/**
	 * Constructor initializes the person's name and email address
	 */
	public Person(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;		
		this.email = email;
	}

	/**
	 * getName method returns the person's full name
	 * @return first name followed by last name, blank separated
	 */
	public String getName(){
		return firstName + " " + lastName;
	}
	
	/**
	 * getEmail method returns the person's email address
	 * @return email address
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * setEmail method sets the person's email address
	 * @param email
	 */
	public void setEmail (String email) {
		this.email = email;
	}
	
	/**
	 * equals method determines whether two persons have the same name
	 * @param other	other Person object that this is compared to
	 * @return true of they have the same first name and last name, false otherwise
	 */
	public boolean equals(Person other){
		if (this.firstName.equals(other.firstName)&& this.lastName.equals(other.lastName))
			return true;
		else
			return false;
	}

	/**
	 * toString method returns a string representation of the person
	 * @return string with first name and last name, email address 
	 */
	public String toString() {
		String s = firstName + " " + lastName + "\t" + email;
		return s;
	}
}
*/


public class Tasks{
	public class static void main(String args[]){
		System.out.println("Isuru");
	}
}



public class Tasks{
	public class static void main(String args[]){
		System.out.println("Isuru");
	}
}
public class Tasks{
	public class static void main(String args[]){
		System.out.println("Isuru");
	}
}


















