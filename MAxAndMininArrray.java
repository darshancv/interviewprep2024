package Practicebasic;

public class MAxAndMininArrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,9,8,3,4,7};
		
		int max=arr[0] , min=arr[0];
		for (int i=0;i<arr.length;i++) {
			
				
				if(max < arr[i]) {
					max= arr[i];
					
				}
				if(arr[i] < min) {
					min= arr[i];
				}
				
			
			
		}
		
		
		System.out.println("min: "+ min + "--- max : " + max);
		
	}

}
