package com.leetcode;

import java.util.HashMap;

public class IntToRomanS {

	public static void main(String[] args) {
		new IntToRomanS().intToRoman(2693);
		System.out.println(new IntToRomanS().intToRomanBest(2693));
		
	}
	
	public String intToRoman(int num) {
		
        HashMap<Integer,Character> hmap = new HashMap<Integer,Character>();
        
        hmap.put(1,'I');
        hmap.put(5,'V');
        hmap.put(10,'X');
        hmap.put(50,'L');
        hmap.put(100,'C');
        hmap.put(500,'D');
        hmap.put(1000,'M');
        
        int[] arr = {1000,500,100,50,10,5,1};
        
        String str="";
        int i=num;
        int j=0;
        int k = 0;
        int f = arr[k];
        
        while(i>0 && k<7){
        	f = arr[k];
        	j = i/f;       	 
        	if( i>=4 && i<5 && f==5){
        		 str+="IV";
        		 i=i%4;
        		 k++;
        	}
        	else if(i>=40 && i<50 && f==50){
        		 str+="XL";
        		 i=i%40;
        		 k++;
        	}         
        	else if(i>=400 && i<500 && f==500){
        		 str+="CD";
        		 i=i%400;
        		 k++;
        	} 
        	else if( i>=9 && i<10 && (f==10 || f==5)){
	       		 str+="IX";
	       		 i=i%9;
	       		 k++;
	       	}
	       	else if(i>=90 && i<100 && (f==100 || f==50)){
	       		 str+="XC";
	       		 i=i%90;
	       		 k++;
	       	}         
	       	else if(i>=900 && i<1000 && (f==1000 || f==500)){
	       		 str+="CM";
	       		 i=i%900;
	       		 k++;
	       	}        
        	else if(j!=0){
        		for(int n=0;n<j;n++){
        		 str+=hmap.get(f);
        		}  
        		i=i%f; 
        	}
        	k++;       	
        }
        
        System.out.println(str);
        
		return str;
        
    }
	
	public String intToRomanBest(int num) {
        String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hrns[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String ths[]={"","M","MM","MMM"};
        
        return ths[num/1000] + hrns[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];
    }

}
