package oop;

import java.util.Scanner;

public class MonthEndDay {
	/*
	 * 월을 입력하면 해당 월의 끝날이 몇일인지 출력하는 프로그램
	 * 1을 입력하면 31일
	 * 단, 2월은 29일로 통일
	 * 주의점... 입력값이 1~12를 넘어서면 잘못된 입력값임을 공지
	 * sw.. 로 처리
	 * 
	 * 추가과제
	 * 2월달 윤년처리.. 년과 월을 입력 받음
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int month = 0;
		System.out.println("월을 입력하시오 : ");
		month = scanner.nextInt();
		int endOfDay=0;
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:endOfDay=31;break;
		case 4:case 6:case 9:case 11:endOfDay=30;break;
		case 2:endOfDay=29;break;
		default:System.out.println("잘못된 값을 입력했음"); break;
		}
		if(endOfDay != 0){
			System.out.println("마지막 날은 : "+endOfDay);
		}
	}
}
