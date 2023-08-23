package weeklytest2;

/**
 * Account : 계좌
 * @author Playdata
 *
 */
public class Account {
	
	private String accNo;// 게좌번호
	private int balance;// 잔고
	
	// 생성자
	public Account(String accNo, int balance) {
		this.accNo = accNo;
		this.balance = balance;
	}

	public Account() {
		
	}

	public String getAccNo() {
		return accNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
		System.out.println(this.accNo
				+ " 계좌가 계설되었습니다.");
	}

	// 메서드
	/**
	 * 기능 : 입급해줍니다.
	 * @param money : 입급액
	 */
	public void deposit(int money) {
		
		this.balance += money;
	}
	
	/**
	 * 기능 : 출금해줍니다.
	 * @param money : 입금액
	 */
	public void withdraw(int money) {
		
		this.balance -= money;
		System.out.println(accNo
				+ " 계좌에 "
				+ money
				+ "만원이 출금되었습니다.");
	}
	
	
	
	

}
