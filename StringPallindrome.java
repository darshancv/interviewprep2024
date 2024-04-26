package Practicebasic;

public class StringPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "abcdtcba";
		
		int left = 0;
		int right =s.length()-1;
		
		Boolean check =true;
		
			while(left<right) {
				
				if(s.charAt(left) == s.charAt(right)) {
					
					left ++ ;
					right--;
					
				}
				else {
					
					check=false;
					break;
				}
				
				
				
			}
			
			if(check) {
				
				System.out.println("palli");
				
			}
			else {
				System.out.print("Not Pallin");
			}
			
		
		
		
	}

}
