package oop.basic;

public class TestSchool {
	
	public static void main(String[] args) {
		
		Student s2 = new Student("김석지", 32, 202002);
		Student s = new Student();
		s.setName("김석진");
		s.setAge(31);
		s.setId(202001);
		
		Teacher t2 = new Teacher("김남주", 32, "Python");
		Teacher t = new Teacher ();
		t.setName("김남준");
		t.setAge(30);
		t.setSubject("JAVA");

		Staff e2 = new Staff("전정구", 26, "음악과");
		Staff  e = new Staff();
		e.setName("전정국");
		e.setAge(25);
		e.setDept("작곡과");
		
		s.display();
		t.display();
		e.display();
		
		System.out.println("----------생성자로 생성------------");
		
		s2.display();
		t2.display();
		e2.display();
		
		
	}

}
