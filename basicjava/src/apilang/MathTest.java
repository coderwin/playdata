package apilang;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MathTest {
	
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out), 50);
		
		System.out.println("Math.PI=>"+Math.PI);
		System.out.println("");
		bw.append("Math.abs(-1)=>"+Math.abs(-1)+"\n");// 절대값
		bw.append("Math.abs(-250)"+Math.abs(-250)+"\n");// 절대값
		bw.append("Math.ceil(10.3)=>"+Math.ceil(10.3)+"\n");
		bw.append("Math.ceil(-11)=>"+Math.ceil(-11)+"\n");
		bw.append("Math.ceil(-11.13)=>"+Math.ceil(-11.13)+"\n");
		bw.append("Math.floor(10.3)=>"+Math.floor(10.3)+"\n");
		bw.append("Math.floor(10.6)=>"+Math.floor(10.6)+"\n");
		bw.append("Math.round(10.3)=>"+Math.round(10.3)+"\n");
		bw.append("Math.round(10.6)=>"+Math.round(10.6)+"\n");
		bw.append("Math.max(10, 3)=>"+Math.max(10, 6)+"\n");
		bw.append("Math.min(10, 3)=>"+Math.min(10, 3)+"\n");
		bw.append("Math.random()=>"+Math.random());
		
		
		
		bw.flush();
		
		
		
	}
}
