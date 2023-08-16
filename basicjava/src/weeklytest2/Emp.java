package weeklytest2;

/**
 * Emp : 사원
 * @author Playdata
 *
 */
public class Emp {
	
	private String id;		// 사원번호
	private String name;	// 이름
	private int baseSalary;	// 기본급
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBaseSalary() {
		return baseSalary;
	}
	
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	// 메서드
	/**
	 * 기능 : 봉급을 계산해줍니다.
	 * @param bonus : 보너스 금액
	 * @return salary : 봉급
	 */
	public double getSalary(double bonus) {
		double salary = baseSalary * bonus + baseSalary;
		return salary;
	}

	@Override
	public String toString() {
		return name
				+ "("
				+ id
				+ ") 사원의 기본급은 "
				+ baseSalary
				+ "원 입니다.";
	}
	
	/**
	 * 기능 : 웹 어플리케이션 실행합니다.
	 * @param args
	 */
	public static void main(String[] args) {
		// 사원이 들어왔습니다.
		Emp newEmployee = new Emp();
		
		String name = "홍길동";
		String id = "12345";
		int baseSalary = 50000;
		newEmployee.setName(name);
		newEmployee.setId(id);
		newEmployee.setBaseSalary(baseSalary);
		
		// 사원이 누구인지 소개해 줍니다.
		System.out.println(newEmployee.toString());
		
		// 사원의 봉급은 얼마인가요?
		int bonus = 30;
		double mySalary = newEmployee.getSalary(bonus);
		System.out.println("봉급 = "
				+ mySalary);
		
	}
	
	
	
	

}
