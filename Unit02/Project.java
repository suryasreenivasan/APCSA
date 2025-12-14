import java.util.*; 
public class Project {

	public static void main(String[] args) {

		
			System.out.print("Enter annual interest rate in %: ");
			Scanner input = new Scanner(System.in);
			double AnnualInterestRate = input.nextDouble();
			System.out.print("Enter number of  years to make payments: ");
			double NumberOfYears =input.nextDouble();
			System.out.print("Enter loan amount: ");
			double LoanAmount = input.nextDouble();
			input.close();
			double MonthlyInterestRate = AnnualInterestRate / 1200;
			double months = NumberOfYears * 12;
			double monthlyPayment = (LoanAmount * MonthlyInterestRate)/
									(1-(1 / (Math.pow(1+MonthlyInterestRate, months))));
			double monthlyPaymentRounded = ((int)(monthlyPayment * 100)) / 100.0;
			System.out.println("Monthly payment: $" + monthlyPaymentRounded);
			
			double totalPaid = (monthlyPayment * months);
			double totalPaidRounded = ((int)((totalPaid + 0.5) * 100)) / 100.0; 
			System.out.println("Total Payment: $"  + totalPaidRounded);
	}

}
