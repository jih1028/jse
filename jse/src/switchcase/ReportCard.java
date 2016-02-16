package switchcase;

import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 학생이름
		System.out.println("학생 이름:");
		String name = scanner.next();

		// 국영수과, 점수 입력 받기
		System.out.println("국어점수:");
		int kor = scanner.nextInt();
		System.out.println("영어점수:");
		int eng = scanner.nextInt();
		System.out.println("수학점수:");
		int math = scanner.nextInt();
		System.out.println("과학점수:");
		int sci = scanner.nextInt();

		// 총점 얼마?, 평균 얼마?
		int total = 0;
		double avg = 0.0;
		total = kor + eng + math + sci;
		avg = (double)total / 4;
		String results="";
		
		String result = "총점:" + total + " 평균:" + avg +"으로 ";
		/*
		if (avg >= 90.0) {
			results = "장학생";
		} else if(avg >= 60.0){
			results = "합격";	
		}else {
			results = "불합격";
		}
		
		System.out.println(result+results+"입니다!");
		*/
		int key = 0; //지역변수의 초기화
		key = (int) (avg / 10);
		switch (key) {
		case 10:results = "장학생";break;
		case 9:results = "장학생";break;
		case 8:results = "합격";break;
		case 7:results = "합격";break;
		case 6:results = "합격";break;
		default:results = "불합격";break;
		
		}
		
		System.out.println(result+results+"입니다!!!");

	}

}
