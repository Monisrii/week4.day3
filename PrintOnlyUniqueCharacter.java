package week4.day3;

import java.util.HashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="babub";
		int length=str.length();
		{
	//		System.out.println("the string is"+" " +str);
		}
		char[] charArray=str.toCharArray();
		for(int i=0;i<length-1;i++)
	{
		System.out.println(charArray[i]);
		}
		Set<Character> obj=new HashSet<Character>();
		obj.add('b');
		obj.add('a');
	    obj.add('b');
	    obj.add('u');
	     obj.add('b');
	     System.out.println(obj);

	//if(String.charAt[1]==String.charAt[2])
	      String [] split=str.split("b");
			for (int i=0;i<split.length;i++)
			{
				System.out.println(split[i]);
			}
	     	
}}
