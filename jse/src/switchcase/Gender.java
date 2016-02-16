package switchcase;

import java.util.Scanner;

public class Gender {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name="";
		String ssn="";
		
		System.out.println("이름?");
		name = scanner.next();
		System.out.println("주민번호?");
		ssn = scanner.next();
		//String ssn = "000101-3232456";
		//ssn = scanner.next();
		char index = ssn.charAt(7);
		System.out.println(index);
		
		String sex ="";
		
		switch (index) {
		case '1':case '3': sex="남자"; break;
		case '2':case '4': sex="여자"; break;
		case '5':case '6': sex="외국인"; break;
		default:sex="????";break;
		}
		System.out.println(sex +"입니다");
	}
}
