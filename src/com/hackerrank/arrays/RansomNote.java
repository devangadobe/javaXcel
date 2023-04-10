package com.hackerrank.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
    	
    	Map<String,Integer> hmap = new HashMap<String,Integer>();
    	int i;
    	
    	for(String str : magazine) {
    		i = hmap.containsKey(str) ? hmap.get(str) : 0;  				
    		hmap.put(str,++i);
    	}    
    	
        
    	for(String str : note) {
    		if(!hmap.containsKey(str)) {
    			System.out.println("No");
    			return;
    		}
    		else if(hmap.get(str) == 0) {
    			System.out.println("No");
    			return;
    		}
    		else {
    			hmap.put(str, hmap.get(str)-1);
    		}
    	}    	
    	System.out.println("Yes");
    	
    }

}

public class RansomNote {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        Result.checkMagazine(magazine, note);

        bufferedReader.close();
    }
}

