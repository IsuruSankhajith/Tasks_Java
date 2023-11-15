package software;

public class SimpleArithmetic {
	public static int add2no(int num1, int num2) {
		return num1 + num2;
	}

	public static int sub2no(int num1, int num2) {
		return num1 - num2;
	}

	public static int mul2no(int num1, int num2) {
		return num1 * num2;
	}

	// Integer divide. Return a truncated int.     
	public static int divInt2no(int num1, int num2) {
		if (num2 == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
		}
		return num1 / num2;
	}

	// Real number divide. Return a double.     
	public static double divReal2no(int num1, int num2) {
		if (num2 == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
		}
		return (double) num1 / num2;
	}
}
