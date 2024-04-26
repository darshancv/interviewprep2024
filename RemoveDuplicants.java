package Practicebasic;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {1,1,2,3,4,5,6,7,7,8};
		
		List<Integer> list = new ArrayList<Integer>();
		
		
		System.out.println("length:"  + arr.length);
		
		for(int i=0;i<arr.length;i++) {
			
		
				if(!list.contains(arr[i]))
				{
					list.add(arr[i]);
				}
				
			
		}
		
		for(Integer l : list) {
			
			
			System.out.println(l);
			
		}
		
		
		
		
		
		
	}

}
