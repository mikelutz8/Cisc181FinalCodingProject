package app.controller;
import org.apache.poi.ss.formula.functions.FinanceLib;
import java.time.LocalDate;

public class Loan {

	public static double calcTotalPayments(double principle, int loanTerm, double interestRate) {
	
		
		interestRate = interestRate / 1200;
		
		int months = loanTerm * 12;
		
		double top = principle * interestRate * months;
		
		double bottom = 1 - (Math.pow(1 + interestRate, -1 * months));
		
		double totalPayments =  top/bottom;
		
		return Math.round(totalPayments * 100) / 100;
	}
	
}
