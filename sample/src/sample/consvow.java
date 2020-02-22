package sample;

import java.util.HashMap;

public class consvow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="killerlook";
		String s2="aeiou";
		char[] c1= s.toCharArray();
		char[] c2 = s2.toCharArray();
		int vowcount=0;
		int conscount=0;
		
		HashMap<Character, Integer> h= new HashMap<Character, Integer>();
		
		
		for(Character c:c1)
		{
			if(h.containsKey(c))
			{
				h.put(c,h.get(c)+1);
			}
			else 
			{
				h.put(c,1);
			}
		}
		for(Character c:c2)
		{
			if(h.containsKey(c))
			{
				vowcount=h.get(c)+vowcount;
			}
		}

		
		

	}

}
