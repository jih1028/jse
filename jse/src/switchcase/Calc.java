package switchcase;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1=0;
		int num2=0;
		System.out.println("숫자 입력");
		num1 = scanner.nextInt();
		System.out.println("연산자 입력");
		String opcode = "";
		opcode = scanner.next();
		System.out.println("숫자 입력");
		num2 = scanner.nextInt();
		
		int result = 0;
		switch (opcode) {
		case "+":result=num1+num2;break;
		case "-":result=num1-num2;break;
		case "*":result=num1*num2;break;
		case "/":result=num1/num2;break;
		case "%":result=num1%num2;break;

		default:System.out.println("연산기호를 정확하게 입력해 주세요."); break;
		}
		
		System.out.println(num1+opcode+num2+"="+result);
		
	}
}
