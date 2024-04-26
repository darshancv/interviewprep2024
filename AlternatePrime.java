package Practicebasic;

public class AlternatePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] primes = new int[100];
				int j=0;
			for(int i=2;i<=100;i++) {
			if(i==2) {
				primes[j]=i;
				j++;
			}
			else{
				
				for(int k=2;k<i;k++)
				{
					if(i%k ==0) {
						//flag
					}
				}
				
				primes[j] =i;
				j++;
			}
		}
			
			for(int k =0;k<=primes.length;k++) {
				if(k%2==0) {
				System.out.println(k);
			}
			}
		
		
	}

}
