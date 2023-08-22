package apilang;

public class Owner {

	String name;
	String cellPhone;

	// 생성자
	public Owner(String name, String cellPhone) {
		this.name = name;
		this.cellPhone = cellPhone;
	}

	// 메서드

	public String getName() {
		return name;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Owner) {
			Owner ow = (Owner) obj;
			if (this.name.equals(ow.getName())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "이름은 " + name + ", 핸드폰 번호는 " + cellPhone + "입니다.";
	}

}
