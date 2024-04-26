package Practicebasic;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int prime []=new int[100];
		int k=0;
		for(int i=1;i<=100;i++)
		{	boolean flag=true;
			for(int j=2;j<=i-1;j++)
			{
				
				if(i%j==0)
				{
					flag=false;
				
				}
			}
		
			if(flag==true) 
			{
				prime[k]=i;
				k++;
			//	System.out.println(i);
			
			}
		}
		for(int l=0;l<prime.length;l++) {
			if(l%2==0 && prime[l] != 0) {
				System.out.println(prime[l]);
			}
			
		}
		
	}

}
