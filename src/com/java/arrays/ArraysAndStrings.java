package com.java.arrays;

import java.util.Arrays;

public class ArraysAndStrings {

	public static void main(String[] args) {
		String str = "abcA";
		//System.out.println(isUnique(str));
		
		System.out.println(isPermutable("abc", "caba"));

	}
	
	public static boolean isUnique(String s) {
		if (s == null || s.length() > 256) {
			return false;
		}
		boolean[] map = new boolean[256];
		char[] chars = s.toCharArray();
		for (char c : chars) {
			if (map[c]) {
				return false;
			}
			map[c] = true;
		}
		return true;
		
	}
	
	public static boolean isPermutable(String str1, String str2) {
		
		if(str1.length() != str2.length()) return false;
		
		char[] charStr1 = str1.toCharArray();
		char[] charStr2 = str2.toCharArray();
		
		Arrays.sort(charStr1);
		Arrays.sort(charStr2);
		
		
		String string1 = new String(charStr1);
		String string2 = new String(charStr2);
		
		if(string1.equals(string2)) return true;
		
		return false;
	}
	
	public static String URLify(String str) {
		
		return "";
	}

}
