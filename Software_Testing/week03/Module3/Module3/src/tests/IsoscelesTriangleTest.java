// code is insider the tests package (where we should keep all of our JUnit 5 Tests)
package tests;

// import our isosceles triangle class so we can test our current logic
import code.IsoscelesTriangle;

// various inputs so we can manipulate the standard input/ output and capture console stuff
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

// the various JUnit 5 libraries that will have me perform these tests
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * The point of this test class is to ensure the iscoceles triangle class is working as intended.
 * More importantly, this class provides a means to test programs that use void methods and
 * print to the console without returning values.. this is a bit tricky!
 *
 * @author lbkelly0
 *
 */
public class IsoscelesTriangleTest {

	// Declare a ByteArrayOutputStream to capture standard output
	private ByteArrayOutputStream outContent;

	// Before each test, set up the output stream to capture standard output
	@BeforeEach
	public void setUpStreams() {
		/*
		 * outContent is a ByteArrayOutputStream object that is used to capture 
		 * the output printed to the console. When we call System.setOut(new PrintStream(outContent));,
		 * we redirect the standard output to outContent.
		 * 
		 * We can then compare this stored output to the expected output in our JUnit tests.
		 * */
		outContent = new ByteArrayOutputStream();
		/*
		 * By default, the standard output is printed to the console, but with System.setOut(), 
		 * we can redirect it to a file, a socket, or any other output stream. Above we set an output
		 * stream and we use this to save the console output so we can store it.
		 * */
		System.setOut(new PrintStream(outContent));
	}

	// After each test, restore standard output to its original state
	@AfterEach
	public void restoreStreams() {
		/*
		 * After each test we might want to set the output stream back to its original value 
		 * so that subsequent code in our program will print to the console as usual. Just in case
		 * we are using System.out.println(); somewhere or are expecting something to display in the
		 * console. This is nice housekeeping.
		 * */
		System.setOut(System.out);
	}

	// Test case 1: when the triangle is an isosceles triangle
	@Test
	@DisplayName("Test Case 1: isosceles triangle")
	public void testIsoscelesTriangle_tc1() {
		// Define input to the program
		String input = "5\n6\n5\n";
		// Create an InputStream from the input string
		InputStream in = new ByteArrayInputStream(input.getBytes());
		// Set standard input to the InputStream
		System.setIn(in);
		// Call the main method of the Triangle class
		IsoscelesTriangle.main(new String[] {});
		// Define the expected output
		String expectedOutput = "Enter the values of three sides of the triangle: \r\n"
				+ "This triangle is Isosceles!\r\n";
		// Compare the expected output to the actual output captured in outContent
		Assertions.assertEquals(expectedOutput, // what I expect to see... the string above 
				outContent.toString() // what I actually see, the thing that was going to be shown in the console
				);
	}

	// Test case 2: when the triangle is not an isosceles triangle
	@Test
	@DisplayName("Test Case 2: not an isosceles triangle")
	public void testNotIsoscelesTriangle_tc2() {
		// Define input to the program
		String input = "3\n4\n5\n";
		// Create an InputStream from the input string
		InputStream in = new ByteArrayInputStream(input.getBytes());
		// Set standard input to the InputStream
		System.setIn(in);
		// Call the main method of the Triangle class
		IsoscelesTriangle.main(new String[] {});
		// Define the expected output
		String expectedOutput = "Enter the values of three sides of the triangle: \r\n"
				+ "This is an inferior triangle\r\n";
		// Compare the expected output to the actual output captured in outContent
		Assertions.assertEquals(expectedOutput, outContent.toString());
	}

	// Test case 3: numbers out of range
	@Test
	@DisplayName("Test Case 3: numbers out of range")
	public void testNumnbersOutOfRange_tc3() {
		// Define input to the program
		String input = "1\n2\n3\n";
		// Create an InputStream from the input string
		InputStream in = new ByteArrayInputStream(input.getBytes());
		// Set standard input to the InputStream
		System.setIn(in);
		// Call the main method of the Triangle class
		IsoscelesTriangle.main(new String[] {});
		// Define the expected output
		String expectedOutput = "Enter the values of three sides of the triangle: \r\n"
				+ "Please enter valid numeric lengths between 2 and 20.\r\n";
		// Compare the expected output to the actual output captured in outContent
		Assertions.assertEquals(expectedOutput, outContent.toString());

	}
	
	// Test case 4: invalid input
	@Test
	@DisplayName("Test Case 4: invalid input")
	public void testInvalidInput_tc4() {
		// Define input to the program
		String input = "a\n";
		// Create an InputStream from the input string
		InputStream in = new ByteArrayInputStream(input.getBytes());
		// Set standard input to the InputStream
		System.setIn(in);
		// Call the main method of the Triangle class
		IsoscelesTriangle.main(new String[] {});
		// Define the expected output
		String expectedOutput = "Enter the values of three sides of the triangle: \r\n"
				+ "Please, use numbers, triangles are measured in numeric lengths..\r\n";
		// Compare the expected output to the actual output captured in outContent
		Assertions.assertEquals(expectedOutput, outContent.toString());
	}


	
}