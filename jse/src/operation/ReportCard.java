package operation;

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
		
		System.out.println("총점:" + total + "     평균:" + avg +"으로");
		if (avg >= 60.0) {
			System.out.println("합격입니다!");
		} else {
			System.out.println("불합격입니다!");
		}

	}

}
