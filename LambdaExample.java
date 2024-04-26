package Prep;

interface Greeting{
	void sayHello(String str);
}


public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Greeting greeting = (str) -> System.out.println(str);
		
		greeting.sayHello("hello");
	}

}
