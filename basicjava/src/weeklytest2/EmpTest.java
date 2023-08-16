package weeklytest2;

/**
 * EmpTest : 사원 테스트
 * @author Playdata
 *
 */
public class EmpTest {
	
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
