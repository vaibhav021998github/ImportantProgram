package com.test;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse String Program
		String s="ram";
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		System.out.println("Reverse String : "+s1);

	}

}
