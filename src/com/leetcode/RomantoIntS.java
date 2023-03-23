package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RomantoIntS {

	public static void main(String[] args) {
		
		System.out.println(new RomantoIntS().romanToInt("MMDCXCIII"));
        
	}
	
    public int romanToInt(String s) {
    	
    	
    	 String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
         String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
         String hrns[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
         String ths[] = {"","M","MM","MMM"};
         
         HashMap<String,Integer> hmapOnes = new HashMap<String, Integer>();
         HashMap<String,Integer> hmapTens = new HashMap<String, Integer>();
         HashMap<String,Integer> hmapHrns = new HashMap<String, Integer>();
         HashMap<String,Integer> hmapThs = new HashMap<String, Integer>();
         
         int j=0;
         
         for (int i = 0; i < ones.length; i++) {
        	 hmapOnes.put(ones[i],i);
		 }j=0;
         for (int i = 0; i < tens.length; j+=10,i++) {
        	 hmapTens.put(tens[i],j);
		 }j=0;
         for (int i = 0; i < hrns.length; j+=100,i++) {
        	 hmapHrns.put(hrns[i],j);
		 }j=0;
         for (int i = 0; i < ths.length; j+=1000,i++) {
        	 hmapThs.put(ths[i],j);
		 }j=0;
		 
         String str="";
         Map<String, Integer> smap = new HashMap<String,Integer>();
         smap.putAll(hmapOnes);
         smap.putAll(hmapTens);
         smap.putAll(hmapHrns);
         smap.putAll(hmapThs);
         
         //System.out.println(smap);
         int num = 0;
         int i=j;
         while(j<s.length()) {        	 
        	str+=s.charAt(j);
        	if(!smap.containsKey(str)){
        		num+=smap.get(str.substring(0,str.length()-1));
        		j--;
        		str="";
        	}
            j++;
         }
         
         
    	
    	return num + smap.get(str);
        
    }

}
