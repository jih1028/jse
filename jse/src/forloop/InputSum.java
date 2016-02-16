package forloop;

import java.util.Scanner;

public class InputSum {
	//두개의 정수를 입력 받아서 그 범위내의 정수의 합 구하기(단, - 는 없음)
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i=0,j=0;
		System.out.println("첫번째 정수 :");
		i = scanner.nextInt();
		System.out.println("두번째 정수 :");
		j = scanner.nextInt();
		//10,12
		int sum = 0;
		int biggerN=0,smallerN=0;
		biggerN = (i>j) ? i : j;
		smallerN = (i>j) ? j : i;
		for (int j2 = smallerN; j2 <= biggerN; j2++) {
			sum = sum +j2; 
		}
		System.out.println("두 정수 범위내의 정수의 합 : " + sum);
		
		
	}
}
