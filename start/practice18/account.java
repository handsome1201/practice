package practice18;

public class account {
	private String name;
	private String no;
	private long balance;

	account(String n, String number, long z){
		this.name=n;
		this.no=number;
		this.balance=z;
	}
	String getname() {
		return name;
	}
	String getno() {
		return no;
	}
	long balance() {
		return balance;
	}
	void deposit(long k) {
		balance=balance+k;
	}
	void withdraw(long k) {
		balance=balance-k;
	}
}
