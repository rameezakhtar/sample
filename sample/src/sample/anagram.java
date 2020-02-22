package sample;

import java.util.HashMap;
import java.util.Map.Entry;


public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="arme";
		String s2="mary";
		boolean f=false;
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		if(c1.length==c2.length)
		{
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
HashMap<Character, Integer> h2= new HashMap<Character, Integer>();
			
			for(Character c:c2)
			{
				if(h2.containsKey(c))
				{
					h2.put(c,h2.get(c)+1);
				}
				else 
				{
					h2.put(c,1);
				}
			}
			for(Entry<Character,Integer> e:h.entrySet())
			{
				if(h2.containsKey(e.getKey())&& h2.get(e.getKey()).equals(e.getValue()))
				{
					f=true;
				}
				else
				{
					f=false;
					break;
				}
			}
			if(f==true)	
			{
				System.out.println("is anagram");

			}
			else
			{
				System.out.println("not anagram");
			}
		}
		else
		{
			System.out.println("not anagram");
		}

		

	}

}
