package array;

public class SumoneToTen {
	public static void main(String[] args) {
		int[] arr; //배열의 선언
		arr = new int[10];
		

		/*for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.println(arr[i]);
		}*/
		
		for (int j : arr) {
			arr[j] = j+1;
			System.out.println(arr[j]);
		}
		
	}
}
