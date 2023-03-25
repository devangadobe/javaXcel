package com.leetcode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParanthesisS {

	public static void main(String[] args) {
		
		System.out.println(new ValidParanthesisS().isValid("())"));
       
	}
	public boolean isValid(String s) {
    	
    	if(s.length() <=1 || s.length()%2!=0) {
    		return false;
    	} 
    	
    	HashMap<Character,Character> hmap = new HashMap<Character, Character>();
    	hmap.put(')','(');hmap.put('}','{');hmap.put(']','[');
    	
    	Stack<Character> stk = new Stack<Character>();
    	char c;
    	
    	for(int i=0; i<s.length(); i+=1){
    		c = s.charAt(i);
    		if(c=='(' || c=='{' || c=='['){
    		   stk.push(c);	
    		}else if ( stk.empty() || hmap.get(c) != stk.pop() ){
    		   return false;
    		}
    	}
        return stk.empty();
    }
}
