package sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class count {

	public static void main(String[] args) {
		
		String s="givesamemoney";
		
		char[] c=s.toCharArray();
		
		HashMap<Character,Integer> h=new HashMap<Character, Integer>();
		
		for(Character a:c)
		{
			if(h.containsKey(a))
			{
				
				h.put(a,h.get(a)+1);
			}
			else
			{
				h.put(a,1);
			}
		}
		for (Entry<Character, Integer> e:h.entrySet()) {			if(e.getValue()>1)
			{
				System.out.println("repeated chararecter "+e.getKey());
			}
		}
		
		
			}

}
