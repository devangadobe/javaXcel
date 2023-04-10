package com.hackerrank.arrays;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;


public class ArrayManipulations {

	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/devangbagora/Downloads/HFJava/outf"));

	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int n = Integer.parseInt(firstMultipleInput[0]);

	        int m = Integer.parseInt(firstMultipleInput[1]);

	        List<List<Integer>> queries = new ArrayList<>();

	        IntStream.range(0, m).forEach(i -> {
	            try {
	                queries.add(
	                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	                        .map(Integer::parseInt)
	                        .collect(toList())
	                );
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        });

	        long result = arrayManipulation(n, queries);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }

	
	public static long arrayManipulation(int n, List<List<Integer>> queries) {
		
		long[] arr = new long[n+2];
	
	    long max = 0;
	    int a,b;
	    Integer k;
	    
        for(List<Integer> qlist : queries) {
        	
        	   a  = qlist.get(0);
        	   b =  qlist.get(1);
        	   k  = qlist.get(2);
           
               arr[a]+=k;
               arr[b+1]-=k;
            }
  
        long c=0;
        
        for(long e : arr) {
        	c+=e;
        	max = Math.max(c,max);
         }
        
        System.out.println(max);
        return max;               
    }
}
