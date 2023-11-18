///////////////////////////////////////////////////////////////////////////
/*

*/

public class Tasks2{
	public static void main(String args[]){
		double A, p, r;
		
		p = 1000;
		r = 0.5;
		
		A = p*(1+r)*p*(1+r);
		
		System.out.println(A);
		
	}
}

public class CompoundInterest {
    public static void main(String[] args) {
        // Input values
        double principal = 1000; // original amount invested
        double rate = 0.05;     // annual interest rate (5%)
        int years = 5;          // number of years

        // Calculate the amount using the compound interest formula
        double amount = principal * Math.pow(1 + rate, years);

        // Print the result
        System.out.println("Total amount after " + years + " years: $" + amount);
    }
}















































