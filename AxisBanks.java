package week4.day3;

public class AxisBanks extends BankInfo {
	public void deposit()
	{
		System.out.println("Implementing overriding with same method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBanks obj=new AxisBanks();
		obj.deposit();
		obj.savings();
		obj.fixed();

	}

}
