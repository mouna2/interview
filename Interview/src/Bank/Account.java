package Bank;

public class Account implements AccountService{

	static int sum=0; 
	
	@Override

	public void deposit(int amount) {
		// TODO Auto-generated method stub
		sum=sum+amount; 
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		sum=sum-amount; 
	}

	@Override
	public void printStatement() {
		// TODO Auto-generated method stub
		System.out.println(sum);
	}

}
