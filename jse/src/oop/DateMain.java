package oop;

import java.util.Scanner;

public class DateMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int year=0,month = 0;
		System.out.println("년을 입력하시오 : ");
		year = scanner.nextInt();
		System.out.println("월을 입력하시오 : ");
		month = scanner.nextInt();
		String endOfDay ="";
		
		DateService dateS = new DateServiceImpl();
		endOfDay = dateS.getEndDayOfMonth(year, month);
		
		if(endOfDay != ""){
			System.out.println("마지막 날은 : "+endOfDay);
		}else{
			System.out.println("잘못된 값을 입력했음");
		}
	
		
		
		
	}
}
