package Prep;

public class Overrriding {

	public void hello() {
		System.out.println("hello");
		
	}
	 public static void main(String[] args) {
			// TODO Auto-generated method stub

		 
		 SubClass sb= new SubClass();
				 sb.hello();
		 
		}
}
 class SubClass extends Overrriding{
	 
	 
	 public void hello() {
		 
		System.out.println("child helllo");
	 }
	 
	

	 
 }