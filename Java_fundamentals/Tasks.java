
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

 
public class Tasks {
	
	 Attribute declarations 
	private String lastName;	// last name
	private String firstName;	// first name
	private String email;		// email address
			

	public Person(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;		
		this.email = email;
	}

	
	public String getName(){
		return firstName + " " + lastName;
	}
	

	public String getEmail() {
		return email;
	}
	
	
	 
	public void setEmail (String email) {
		this.email = email;
	}
	
	public boolean equals(Person other){
		if (this.firstName.equals(other.firstName)&& this.lastName.equals(other.lastName))
			return true;
		else
			return false;
	}

	public String toString() {
		String s = firstName + " " + lastName + "\t" + email;
		return s;
	}
}





public class Tasks {
	
	 Attribute declarations 
	private String lastName;	// last name
	private String firstName;	// first name
	private String email;		// email address
			
	public Person(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;		
		this.email = email;
	}

	public String getName(){
		return firstName + " " + lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	
	public boolean equals(Person other){
		if (this.firstName.equals(other.firstName)&& this.lastName.equals(other.lastName))
			return true;
		else
			return false;
	}

	
	public String toString() {
		String s = firstName + " " + lastName + "\t" + email;
		return s;
	}
}



package Tasks;

public class Tasks {
    public static int add2no(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub2no(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul2no(int num1, int num2) {
        return num1 * num2;
    }

    public static int divInt2no(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by 0!");
        }
        return num1 / num2;
    }

    public static double divReal2no(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by 0!");
        }
        return (double) num1 / num2;
    }
}




///////////////////////////////////////////////////////////////////////////////////

int size = 27;
string name = "fido";
Dog myDog = new Dog (name,size);
x=size-5;
if(x<15) myDog.bark(8);

while (x>3){
	myDog.play();	
}

int[] numList = {2,4,6,8};
System.out.print("Hello");
System.out.print("Dog : "+ name);
String num = "8";
int z = Integer.paraseInt(num);

try{
	readTheFile("myFile.txt");	
}
catch(FileNotFoundExceptation ex){
	System.out.println("File not found.");
}

///////////////////////////////////////////////////////////////////////////

public class Tasks2{
	public static void main (String args[]){
		System.out.println("sadfsdf");
	}
}



public class Tasks2{
	public static void main (String args[]){
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
	}
}
///////////////////////////////////////////////////////////////////////////
public class Tasks2{
	public static void main (String args[]){
		System.out.println("A");
		System.out.print("B");
		System.out.println("C");
		System.out.print("D");
	}
}


///////////////////////////////////////////////////////////////////////////

public class Tasks2{
	public static void main (String args[]){
		System.out.println("1");
		System.out.println("1000");
		System.out.println("1.23");

	}
}

///////////////////////////////////////////////////////////////////////////
public class Tasks2{
	public static void main (String args[]){
		System.out.println("A");
		System.out.println(12324);
		System.out.println(-1234);
		System.out.println(1.2345);
		System.out.println(0.12345);
		System.out.println(-0.122344);
		System.out.println('A');
		System.out.println('6');
		System.out.println(true);
		System.out.println(false);
		
		
	}
}


///////////////////////////////////////////////////////////////////////////


public class Tasks2{
	public static void main (String args[]){
		System.out.print("A");
		System.out.print("B");
		System.out.print("C");
		System.out.print("D");
		System.out.print("E");		
	}
}



public class Tasks2{
	public static void main (String args[]){
		System.out.print("A");
		System.out.print("B");
		System.out.print("");
		System.out.print("D");
		System.out.print("E");		
	}
}
public class Tasks2{
	public static void main (String args[]){
		System.out.println("sadfsdf");
	}
}



public class Tasks2{
	public static void main (String args[]){
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
	}
}
///////////////////////////////////////////////////////////////////////////
public class Tasks2{
	public static void main (String args[]){
		System.out.println("A");
		System.out.print("B");
		System.out.println("C");
		System.out.print("D");
	}
}


///////////////////////////////////////////////////////////////////////////

public class Tasks2{
	public static void main (String args[]){
		System.out.println("1");
		System.out.println("1000");
		System.out.println("1.23");

	}
}

///////////////////////////////////////////////////////////////////////////
public class Tasks2{
	public static void main (String args[]){
		System.out.println("A");
		System.out.println(12324);
		System.out.println(-1234);
		System.out.println(1.2345);
		System.out.println(0.12345);
		System.out.println(-0.122344);
		System.out.println('A');
		System.out.println('6');
		System.out.println(true);
		System.out.println(false);
		
		
	}
}


///////////////////////////////////////////////////////////////////////////


public class Tasks2{
	public static void main (String args[]){
		System.out.print("A");
		System.out.print("B");
		System.out.print("C");
		System.out.print("D");
		System.out.print("E");		
	}
}


///////////////////////////////////////////////////////////////////////////

public class Tasks2{
	public static void main (String args[]){
		System.out.print("A");
		System.out.print("B");
		System.out.print("");
		System.out.print("D");
		System.out.print("E");		
	}
}


///////////////////////////////////////////////////////////////////////////

public class Tasks2{
	public static void main(String args []){
		int x;
		x = 100;
		System.out.println(x);
	}
}


///////////////////////////////////////////////////////////////////////////
public class Tasks2{
	public static void main(String args []){
		int x;
		x = 100;
		x =200;
		System.out.println(x);
		
	}
}


///////////////////////////////////////////////////////////////////////////
public class Tasks2{
	public static void main(String args []){
		int x;
		x = 100;
		
		System.out.println(x);
		
		x =200;
		System.out.println(x);
		
	}
}


///////////////////////////////////////////////////////////////////////////
public class Tasks2{
	public static void main(String args []){
		int x;
		x = 100;
		
		System.out.println(x);
		int y;
		y =200;
		System.out.println(y);
		
	}
}

///////////////////////////////////////////////////////////////////////////

public class Tasks2{
	public static void main(String args []){
		int x = 100;
		int y  = 100;
		
		System.out.println(x);
		System.out.println(y);
		
	}
}

///////////////////////////////////////////////////////////////////////////

public class Tasks2{
	public static void main(String args []){
		int x = 100,y,z  = 100;;
		
		System.out.println(x);
		y =300;
		System.out.println(y);
		System.out.println(z);
		
	}
}


public class Tasks2{
	public static void main(String args []){
		System.out.println('y');
		System.out.println("A");
		
	}
}


public class Tasks2{
	public static void main(String args []){
		System.out.println("AB\bCD");
	}
}

///////////////////////////////////////////////////////////////////////////

public class Tasks2{
	public static void main(String args []){
		System.out.println("AB\tCD");
	}
}

///////////////////////////////////////////////////////////////////////////
public class Tasks2{
	public static void main(String args []){
		System.out.println("AB\nCD");
	}
}

///////////////////////////////////////////////////////////////////////////
public class Tasks2{
	public static void main(String args []){
		System.out.println("AB\\CD");
		System.out.println("AB\'CD");
		System.out.println("AB\"CD");
		
	}
}


///////////////////////////////////////////////////////////////////////////
public class Tasks2{
	public static void main(String args []){
		System.out.println("AB\\CD");
		System.out.println("AB\'CD");
		System.out.println("AB\"CD");
		
	}
}

///////////////////////////////////////////////////////////////////////////
public class Tasks2{
	public static void main(String args []){
		System.out.println("AB\"CD");
		System.out.println("AB\"CD");
		System.out.println("AB\"CD");
		System.out.println("AB\"CD");
		System.out.println("AB\"CD");
		System.out.println("AB\"CD");		
	}
}


////////////////////////////////////////////////////////////////////////////////////////////

public class Tasks2{
	public static void main (String args[]){
		System.out.println(10+20);
		System.out.println("10"+" "+ "20");
		System.out.println("10"+20);
		System.out.println(10+"20");
	}
}
 
///////////////////////////////////////////////////////////////////////////

public class Tasks2{
	public static void main (String args[]){
		System.out.println(40234124);
		System.out.println("04-03-234");
		System.out.println(40234124);
	}
}

///////////////////////////////////////////////////////////////////////////

public class Tasks2{
	public static void main (String args[]){
		int x=10, y =20;
		System.out.println(x+y);
		System.out.println("x"+"y");
		System.out.println("x+y");
		System.out.println("x"+y);
		System.out.println(x + "y");
	}
}


///////////////////////////////////////////////////////////////////////////

public class Tasks2{
	public static void main (String args[]){
		int x=10, y =20;
		System.out.println(10 + 20 + 30);
		System.out.println("10 + 20 + 30");
		System.out.println("10 + 20" + 30);
		System.out.println("10" + "20" + "30");
		System.out.println("10" + 20 + 30);
		System.out.println("10" + "20" + 30);
	}
}

///////////////////////////////////////////////////////////////////////////

public class Tasks2{
	public static void main (String args[]){
		int x=10, y =20, z = 30;
		System.out.println(x+ y+ z);
		System.out.println("x + y" + z);
		System.out.println("x");
		System.out.println(+ "30");
		System.out.println(30);
		System.out.println(+ 30);
	}
}


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
        
        if(num1 < 10){
			System.out.println("Higest number");
		}else if(num2 < 50){
			System.out.println("Hige adas");
		}else if(num2 > 100){
			System.out.println("Hige");
		}
    }
}


///////////////////////////////////////////////////////////////


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
        
        // Check which number is the highest among num1, num2, and num3
        if (num1 > num2 && num1 > num3) {
            System.out.println("Highest Value number is " + num1);
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("Highest Value number is " + num2);
        }
        else if (num3 > num1 && num3 > num2) {
            System.out.println("Highest Value number is " + num3);
        }
        else {
            System.out.println("Numbers are not distinct.");
        }
    }
}
///////////////////

import java.util.Scanner;
public class Exercise4 {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        double input = in.nextDouble();

        if (input > 0)
        {
            if (input < 1)
            {
                System.out.println("Positive small number");
            }
            else if (input > 1000000)
            {
                System.out.println("Positive large number");
            }
            else
            {
                System.out.println("Positive number");
            }
        }
        else if (input < 0)
        {
            if (Math.abs(input) < 1)
            {
                System.out.println("Negative small number");
            }
            else if (Math.abs(input) > 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }
        else
        {
            System.out.println("Zero");
        }
    }
}


/////////////////////////////////////////////////////////////////


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


//////////////////////

public class Tasks2 {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Access elements of the array and print them
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Calculate the sum of elements in the array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of elements: " + sum);
    }
}

////////////////////////////////////////////////////////////////////

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n <= 1) {
            return 0;
        }

        int[] leftProfit = new int[n];
        int[] rightProfit = new int[n];

        // Calculate maximum profit if selling on or before the current day
        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            leftProfit[i] = Math.max(leftProfit[i - 1], prices[i] - minPrice);
        }

        // Calculate maximum profit if buying on or after the current day
        int maxPrice = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            rightProfit[i] = Math.max(rightProfit[i + 1], maxPrice - prices[i]);
        }

        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, leftProfit[i] + rightProfit[i]);
        }

        return maxProfit;
    }
}

///////////////////////////////

// Testing - Task C
//i

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
////////////

//ii

Equivalence Partitioning (EP) and Boundary Value Analysis (BVA) are testing techniques used to design effective test cases by dividing the input domain into classes. Let's outline the equivalence classes and provide relevant test cases for the given program.

### Equivalence Classes:

1. **Employee ID:**
   - Valid range: 1000 to 9999
   - Invalid: Below 1000 or above 9999

2. **Employment Type:**
   - Valid values: 'C', 'P', 'F'
   - Invalid values: Any other character

3. **Hours Worked:**
   - Valid range: 5 to 70
   - Invalid: Below 5 or above 70

4. **Hourly Rate:**
   - Valid range: $25.00 to $75.00
   - Invalid: Below $25.00 or above $75.00

### Test Cases:

Let's use Equivalence Partitioning to select representative values from each class and Boundary Value Analysis to test the boundaries.

1. **Valid Test Cases:**
   - EQ Class 1 (Employee ID): 2500
   - EQ Class 2 (Employment Type): 'P'
   - EQ Class 3 (Hours Worked): 35.0
   - EQ Class 4 (Hourly Rate): $50.00

2. **Invalid Test Cases:**
   - EQ Class 1 (Employee ID): 500 (Below minimum)
   - EQ Class 1 (Employee ID): 12000 (Above maximum)
   - EQ Class 2 (Employment Type): 'X' (Invalid character)
   - EQ Class 3 (Hours Worked): 2.0 (Below minimum)
   - EQ Class 3 (Hours Worked): 80.0 (Above maximum)
   - EQ Class 4 (Hourly Rate): $10.00 (Below minimum)
   - EQ Class 4 (Hourly Rate): $100.00 (Above maximum)

3. **Boundary Test Cases:**
   - EQ Class 1 (Employee ID):
     - Boundary: 1000 (Lower bound)
     - Boundary: 9999 (Upper bound)
   - EQ Class 2 (Employment Type):
     - Boundary: 'C' (Lower bound)
     - Boundary: 'F' (Upper bound)
   - EQ Class 3 (Hours Worked):
     - Boundary: 5.0 (Lower bound)
     - Boundary: 70.0 (Upper bound)
   - EQ Class 4 (Hourly Rate):
     - Boundary: $25.00 (Lower bound)
     - Boundary: $75.00 (Upper bound)

### Test Case Specification Sheet (Partial):

| Test Case ID | Employee ID | Employment Type | Hours Worked | Hourly Rate | Expected Output |
|--------------|-------------|------------------|--------------|-------------|-----------------|
| 1            | 2500        | 'P'              | 35.0         | $50.00      | Valid Output    |
| 2            | 500         | 'X'              | 2.0          | $10.00      | Invalid Output  |
| 3            | 12000       | 'F'              | 80.0         | $100.00     | Invalid Output  |
| 4            | 1000        | 'C'              | 5.0          | $25.00      | Valid Output    |
| ...          | ...         | ...              | ...          | ...         | ...             |

Use this table as a template to record additional test cases. Ensure that you cover all equivalence classes, both valid and invalid cases, and the boundaries of each class.


//iii

import static org.junit.Assert.*;
import org.junit.Test;

public class PayrollProgramTest {

    @Test
    public void testValidInput() {
        assertTrue(PayrollProgram.isValidInput(2500, 'P', 35.0, 50.0));
    }

    @Test
    public void testInvalidInput() {
        assertFalse(PayrollProgram.isValidInput(500, 'X', 2.0, 10.0));
    }

    @Test
    public void testCalculateWeeklyWages() {
        double result = PayrollProgram.calculateWeeklyWages(35.0, 50.0);
        assertEquals(1750.0, result, 0.001);
    }

    @Test
    public void testDisplayOutput() {
        // You can redirect System.out to capture the output and then assert it.
        // For simplicity, let's assume the output is a string.
        String expectedOutput = "Employee ID: 2500\nEmployment Type: P\nNumber of Hours Worked: 35.0 hours\nHourly Rate: $50.0\nWeekly Wages: $1750.0\n";
        assertEquals(expectedOutput, getDisplayOutput(2500, 'P', 35.0, 50.0, 1750.0));
    }

    // Helper method to capture System.out
    private String getDisplayOutput(int employeeID, char employmentType, double hoursWorked, double hourlyRate, double weeklyWages) {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the method that prints to System.out
        PayrollProgram.displayOutput(employeeID, employmentType, hoursWorked, hourlyRate, weeklyWages);

        // Reset System.out
        System.setOut(originalOut);

        return outContent.toString();
    }
}








































