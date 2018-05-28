/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		LinkedList<Integer> sc=new LinkedList<Integer>();
		sc.add(1);
		sc.add(2);
		sc.add(3);
		sc.add(4);
		sc.add(5);
		sc.add(6);
		System.out.println(sc);
		int size=sc.size();
		int n=size/2;
		Object ele=sc.get(n);//the datatype may be int or Object
		System.out.println(ele);
		
	}
}
