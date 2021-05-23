package casestudy2;
import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Account No : ");
	 int accNo = sc.nextInt();
	
	System.out.println("Enter Deposit Amount: ");
	int deposit_amt = sc.nextInt();
	
	System.out.println("Enter Withdrawal Amount.: ");
	int withdrawal_amt = sc.nextInt();
	
	
	BalanceInquiry be = new BalanceInquiry();
	be.execute();
	
	Transaction t = new Transaction();
	t.setAccountNumber(accNo);
	t.execute();
		
	Deposit d = new Deposit();
    d.setAmount(deposit_amt);
	d.execute();
	
	Withdrawal w = new Withdrawal();
	
	w.setAmount(withdrawal_amt);
	w.execute();
	
	sc.close();

}

}
	


