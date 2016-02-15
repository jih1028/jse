package operation;

import java.util.Scanner;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class Variable {
	public static void main(String[] args) {
		
		
			boolean b = true;
			char c = 'c';
			int i = 3;
			float f = 3.0f;
			long l = 3000L;
			double d= 3.000031d;
			
			String s = "Hong";
			
			System.out.println(i+"   Hello world!!!!!!!!!!" + s);
			System.out.println(i);
			
			
			System.out.println("얼마입니까?");
			
			Scanner scanner = new Scanner(System.in);
			
			int price = scanner.nextInt();
			System.out.println(price + "원입니다");
			
			System.out.println("이것은 무엇입니까?");
			String what = scanner.next();
			System.out.println(what+"입니다");
			
			
	}
}
