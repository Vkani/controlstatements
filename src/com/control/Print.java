
		package com.control;

public class Print {
public static void main(String[] args) {
	
	StringBuffer s=new StringBuffer("Java");
	StringBuffer s1=new StringBuffer("Selenium");
	
	StringBuffer append=s.append(s1);
	System.out.println(append);
	
	int identityHashcode=System.identityHashCode(s);

	System.out.println("Java Memeory:"+identityHashcode);
	
	int identityHashcode1=System.identityHashCode(s1);
	
	System.out.println("Selenium:"+identityHashcode1);
	
	int identityHashcode2=System.identityHashCode(append);
	System.out.println(identityHashcode2);
	
}
}
