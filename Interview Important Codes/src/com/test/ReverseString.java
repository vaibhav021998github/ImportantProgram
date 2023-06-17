package com.test;

public class ReverseString {

	public static void main(String[] args) {
		//Reverse String 
		String s="ram";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.length();
		}
		System.out.println("Reverse String : "+rev);
	}

}
