package forloop;

public class PrintOneToTen {
	public static void main(String[] args) {
		int sum=0,odd=0,even=0;
		for (int i = 1; i <= 10; i++) {
			
			if (i%2 == 0) {
				even = even + i;
			}else{
				odd = odd + i;
			}
				
			
			System.out.print(i+"\t");
		}
		System.out.println("\n짝수의 합 : "+even);
		System.out.println("\n홀수의 합 : "+odd);
	}
}
