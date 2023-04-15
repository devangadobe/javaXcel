package com.hackerrank.solutions;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class MinimumBribes {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                minimumBribes(q);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

	public static void minimumBribes(List<Integer> q) {
		
		int n=0;
		boolean flag = false;
		
		for (int i = q.size(); i>0; i--) {		
			
			if(i == q.get(i-1)) {
				continue;
			}
			
			if(i == q.get(i-2)){
				Collections.swap(q, i-2, i-1);
				n++;
			}			
			else if(i == q.get(i-3)){
				Collections.swap(q, i-3, i-2);
				Collections.swap(q, i-2, i-1);
				n+=2;
			}else {
				flag = true;
				break;
			}
			
		}
		
		if(flag) {
			System.out.println("Too chaotic");
		}else {
			System.out.println(n);
		}
		
	}

}
