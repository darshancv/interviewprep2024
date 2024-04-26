package Practicebasic;

import java.util.HashMap;
import java.util.Map;

public class CountOfEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "beginnersbooooooooook"; 
		countEachChar(str); 
	}

	private static void countEachChar(String str) {
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		char []strarray=str.toCharArray();
		
		for(char c:strarray)
		{
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println("Name: "+ str + "count: " +map);
		
	}

}
