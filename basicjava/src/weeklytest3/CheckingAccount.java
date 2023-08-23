package weeklytest3;

/**
 * CheckingAccount 설명 : 게좌조회
 * 
 * @author Playdata
 *
 */
public class CheckingAccount extends Account {

	private String cardNo;// 카드번호

	// 생성자
	public CheckingAccount(String ownerName, String accid, int balance, String cardNo) {
		super(ownerName, accid, balance);
		this.cardNo = cardNo;
	}

	// 메소드
	/**
	 * 기능 : 출금할 수 있습니다.
	 * 
	 * @param cardNo
	 * @param amount
	 */
	public void pay(int amount, String cardNo) {
		int balance = super.getBalance();

		if (this.cardNo.equals(cardNo) && amount < balance) {
			super.withdraw(amount);
		} else {
			System.out.println("지불이 불가능합니다.");
		}
	}
}
