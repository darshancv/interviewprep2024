package Practicebasic;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {3, 1, 5, 2};
		int n=arr.length;
		int total = (n + 1)*(n + 2) / 2 ;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			total=total-arr[i];
			
		}
		
	
		System.out.println(total);
		
		
		
		
	}

}
