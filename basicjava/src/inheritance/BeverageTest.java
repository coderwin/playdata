package inheritance;

public class BeverageTest {
	public static void main(String[] args) {
		Coffee myCoffee = new Coffee(2500, "아메리카노");
		Coffee yourCoffee = new Coffee(2700, "카페라떼");
		Coffee theOtherCoffee = new Coffee(300, "카푸치노");
		
		System.out.println("타입:"
				+ myCoffee.getType()
				+ ",가격:"
				+ myCoffee.getPrice()
				+ ",종류:"
				+ myCoffee.getName());
		System.out.println("타입:"
				+ yourCoffee.getType()
				+ ",가격:"
				+ yourCoffee.getPrice()
				+ ",종류:"
				+ yourCoffee.getName());
		System.out.println("타입:"
				+ theOtherCoffee.getType()
				+ ",가격:"
				+ theOtherCoffee.getPrice()
				+ ",종류:"
				+ theOtherCoffee.getName());	
	}
}
