package weeklytest3;

public class Account {

	private String ownerName;// 이름
	private String accid;// 계좌번호
	private int balance;// 잔액

	// 생성자
	public Account(String ownerName, String accid, int balance) {
		this.ownerName = ownerName;
		this.accid = accid;
		this.balance = balance;
	}

	public String getAccid() {
		return accid;
	}

	public void setAccid(String accid) {
		this.accid = accid;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 메서드
	/**
	 * 기능 : 입금합니다.
	 * 
	 * @param money : 입금액
	 */
	public void deposit(int money) {
		balance += money;
	}

	/**
	 * 기능 : 출급합니다.
	 * 
	 * @param money : 출금액
	 */
	public void withdraw(int money) {
		balance -= money;
	}

	public void checkBalance() {
		System.out.println(balance);
	}

}
