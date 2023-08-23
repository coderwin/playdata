package apiutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator<T extends Number> {

	public static void main(String[] args) {

		CalculatorReady<Number> cal1 = new CalculatorReady<>();
		CalculatorReady<Double> cal2 = new CalculatorReady<>();
		CalculatorReady<Integer> cal3 = new CalculatorReady<>();

		CalculatorReady<Board> cla4 = new CalculatorReady<>();
		CalculatorReady<Object> cal5 = new CalculatorReady<>();
		CalculatorReady<Byte> cla6 = new CalculatorReady<>();
		
		
		School<Student> a = new School<>();
		School<Student2> b = new School<>();
		School<Object> c = new School<>();
		School<Double> d = new School<>();
		
		List<Object> list = new ArrayList<Integer>();
		
		List<Object> listObj = null;
		List<String> listStr = null;
		listObj = (List<Object>)listStr;
		listStr = (List<String>)listObj;
		
		List<Integer> lists = new ArrayList<>(Arrays.asList(1, 2, 3));
		printV45(lists);
		
		Integer[] iArr = new Integer[3];
		printV45(iArr);
		
		List<? extends Object> list123 = new ArrayList<String>();
		List<? super String> list2 = new ArrayList<Object>();
		List<? extends String> list45 = new ArrayList<Object>();
		List<? extends >
		
		
	}
	
	public static void printV45(List<Object> list) {
		for(Object e : list) {
			System.out.println(e);
			
		}
		
	}
	
	public static void printV45(Object[] list) {
		for(Object e : list) {
			System.out.println(e);
			
		}
		
	}

}

class CalculatorReady<T extends Number> {
	void add(T a, T b) {
	}

	void min(T a, T b) {
	}

	void mul(T a, T b) {
	}

	void div(T a, T b) {
	}
}

interface Readable {

}

interface Reada {
	
}

class Student implements Readable, Reada {

}

class Student2 extends Student {

}

class School <T extends Readable & Reada> {
	
}

class School32 <T extends Readable & Reada, U extends Readable> {
	
}

class School33 <T extends Comparable<T>> {
	
}



