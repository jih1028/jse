package operation;

import java.util.Scanner;

public class FirstGrade {
	public static void main(String[] args) {
		/**
		 * 첫번째 학생 이름, 평균
		 * 두번째 학생 이름, 평균
		 * 세번째 학생 이름, 평균
		 * 
		 * 결과 : 홍길동이 1등 입니다.
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		String topName = "";
		int topPoint = 0;
		
		String stdName1 ="";
		String stdName2 ="";
		String stdName3 ="";
		int stdPoint1 = 0;
		int stdPoint2 = 0;
		int stdPoint3 = 0;

		System.out.println("첫번째 학생의 이름을 입력하세요 : ");
		stdName1 = scanner.next();
		System.out.println("첫번째 학생의 점수를 입력하세요 : ");
		stdPoint1 = scanner.nextInt();
		
		System.out.println("두번째 학생의 이름을 입력하세요 : ");
		stdName2 = scanner.next();
		System.out.println("두번째 학생의 점수를 입력하세요 : ");
		stdPoint2 = scanner.nextInt();
		
		System.out.println("세번째 학생의 이름을 입력하세요 : ");
		stdName3 = scanner.next();
		System.out.println("세번째 학생의 점수를 입력하세요 : ");
		stdPoint3 = scanner.nextInt();
		
		
		if ( stdPoint1 > stdPoint2 && stdPoint1 > stdPoint3 ) {//1번 1등
			topName = stdName1;
			topPoint = stdPoint1;
		} else if(stdPoint2 > stdPoint3 ){//2번 1등
			topName = stdName2;
			topPoint = stdPoint2;
		} else {//3번 1등
			topName = stdName3;
			topPoint = stdPoint3;
		}
		
		System.out.println(topName+"학생이 1등 입니다.");
		
	}	
}
