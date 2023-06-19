package com.hellofresh.code;

public class ConvertoBinary {

	public static void main(String[] args) {
		
       System.out.println(new ConvertoBinary().decimalToBinary(5));
       System.out.println(new ConvertoBinary().binaryToDecimal("101"));

	}

	private int binaryToDecimal(String bin) {
		int k=0;
		int j=0;
		for (int i = bin.length()-1; i>=0; i--) {
			k+= (int) Character.getNumericValue(bin.charAt(i))*Math.pow(2,j);
			j++;
		}
		
		return k;
		
	}

	private String decimalToBinary(int i) {		
		StringBuilder stb = new StringBuilder();
		
		while(i!=0) {		
			stb.append(i%2);
			i/=2;			
		}
		
		return stb.reverse().toString();
		
	}
	
	
	
}
