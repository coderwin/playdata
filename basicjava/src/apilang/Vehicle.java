package apilang;

public class Vehicle {

	Owner owner;// has a 관계
	int price;

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 메서드
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Vehicle) {
			Vehicle v = (Vehicle) obj;
			if (this.getOwner().equals(v.getOwner())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("소유주정보 : 이름은 " + owner.getName() + "이고, 핸드폰 번호는 " + owner.getCellPhone() + "\n");
		sb.append("차량정보 : 가격은 " + price + "입니다.");
		return sb.toString();
	}

}
