package Prep;

public class Overloading {

	
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static int add(int a,int b ,int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a =9;
		int b=10;
		int c = add(9,10);
		int d =add(9,10,11);
		
		System.out.println(c);
		System.out.println(d);

	}

}
