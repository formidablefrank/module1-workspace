package com.example.helloworld;

public class Primitives {
	public static void main(String[] args) {
//		short x = 0;
//		int i = 12345;
//		int j = (int) (x+i);
//		x = x + i;
//		System.out.println();
//		System.out.println(j);
		
//		Object s = "a";
//		String t = "b";
//		s = s+t;
//		System.out.println(s);
		
//		System.out.println((int)(char)(byte) -1);

		Object o = 's';
		char x = ' ';
		if(o instanceof Character){
			x = (Character) o;
		}
		System.out.println(x);
	}
}
