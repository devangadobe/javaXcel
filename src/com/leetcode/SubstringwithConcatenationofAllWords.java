package com.leetcode;

import java.util.*;

public class SubstringwithConcatenationofAllWords {

	public static void main(String[] args) {
		
		String[] words = {"a","b","a"};
		String s = "abababab";
		
		System.out.println(new SubstringwithConcatenationofAllWords().findSubstring(s, words));

	}
	
	 public List<Integer> findSubstring(String s, String[] words) {
		 HashSet<Integer> hset  = new HashSet<Integer>();
		 String ans = "";
		
		 List<String> perms  = new ArrayList<String>();
		 perms = permutations(words,ans,perms);
		 
		 boolean flag = true;
		 int i, k, f;
		 
		 for(String str : perms) {
             i=0;
             flag = true;
			 while(flag){
				 k = s.substring(i).indexOf(str);
				 flag = (k!=-1);
				 if(flag) {
					 hset.add(i+k);
					 if(allCharactersSame(str)) {
						 i++;
					 }else {
						 f = forwardToIndex(s,i,k,str);
					     i = i + k + f;
					 }
				 }
			 }
		 }
		 	 
		return hset.stream().toList(); 	        
	}

	private int forwardToIndex(String s, int i, int k, String str) {
		char c = s.substring(i+k).charAt(0);		
		int f=1;
		for(int j=1; j<str.length();j++) {
			if(s.substring(i+k).charAt(j)!=c) {
				f++;
			}else {
				break;
			}
		}
		return f;
	}

	private List<String> permutations(String[] words, String ans, List<String> perms) {
		
        if(words.length==0) {
        	perms.add(ans);
        }
		
        for(int i=0; i<words.length; i++) {      	
        	String[] ros = concatWithouti(words,i);
            permutations(ros,ans + words[i],perms);       	
        }
        
        return perms;

	}

	private String[] concatWithouti(String[] words, int i) {
		
		String[] one  = Arrays.copyOfRange(words,0,i);
		String[] two  = Arrays.copyOfRange(words,i+1,words.length);
		
		List<String> concated = new ArrayList<String>(one.length+two.length);
		
		concated.addAll(List.of(one));
		concated.addAll(List.of(two));
		
		return (String[]) concated.toArray(new String[0]);
	}
	
	public static boolean allCharactersSame(String s)
	{
	    Set<Character> s1 = new HashSet<Character>();
	     
	    // Insert characters in the set
	    for(int i = 0; i < s.length(); i++)
	        s1.add(s.charAt(i));
	      
	    // If all characters are same
	    // Size of set will always be 1
	    if (s1.size() == 1)
	        return true;
	    else
	        return false;
	}

}
