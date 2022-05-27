package week4.day1;

public class Bank implements CIBIL,PNB {
	public void maximumLoanAmount() {
		System.out.println("100000");
		
	}

	public void creditScore() {
		System.out.println("75%");
		
	}

	public void minimumBalance() {
		System.out.println("50000");
	}

	public void cibilScore() {
		System.out.println("80%");
		
	}
	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.maximumLoanAmount();
		obj.creditScore();
		obj.minimumBalance();
		obj.cibilScore();
		CIBIL newobj=new Bank();
		newobj.cibilScore();
		PNB pnbobj=new Bank();
		pnbobj.maximumLoanAmount();
		pnbobj.minimumBalance();
		
	}

	
}
