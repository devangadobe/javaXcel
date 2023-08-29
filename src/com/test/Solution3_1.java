package com.test;

public class Solution3_1 {

	public static void main(String[] args) {
		System.out.println(new Solution3_1().solution("CADCB"));
	}

	public String solution(String str) {
		String temp = str;
		while(str.length()>0) {
			temp = str;
			str = str.replaceAll("AB","")
			.replaceAll("BA","")
			.replaceAll("CD","")
			.replaceAll("DC","");
			if(str.equalsIgnoreCase(temp)){
				break;
			}
		}
		return str;
	}
}
