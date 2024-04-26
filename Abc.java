package Practicebasic;

import java.util.HashMap;
import java.util.Map;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Alph=65,i=0;
		for(int k=0;k<5;k++)
		{
			for(int j=0;j<=k;j++)
			{
				System.out.print((char)(Alph+i)+" ");
				i++;
			}
			System.out.println();
		}
		
		
	}

}
