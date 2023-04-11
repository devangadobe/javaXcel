package com.hfjava;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File("/Users/devangbagora/Downloads/All-in-one/ashoks/archive/Vijayji2022sales/invoice.txt"));
            String str = null;
            String[] stry = {"Rose","Orange","Lemon","Pineapple","Kachi Keri","Khus","Variyali",
            		"Paan","Butter Scotch","Shahi Gulab","Thandai","Kesar Elaichi","Masala Kokam",
            		"Shahi Paan","Anjeer Kesar","Orange Blossom","Masala Jeera","Bubble Gum","Coffee"
            		,"Coffee Gold","Strawberry","Mojito","Blue Curcao","Blue Lagoon","Green Apple","Ginger Lemon",
            		"Ganga Jamuna","Dry Fruit","Butter Falooda","Pina Colada","Kiwi","Ice Cream Falooda",
            		"Lemon Iced Tea","Fresh Pineapple","Fresh Orange","Black Current","Blue Berry",
            		"Fresh Orange","Pink Peru","Litchi","Chocolate","Nimbu Shikanji","Mava  Badam",
            		"Kala Khatta","Fruit Beer","Rose White"};
            List<String> stlist = Arrays.asList(stry);
            Map<String,Integer> hmap = new HashMap<String,Integer>();
            int quan = 0;
            
			while (scanner.hasNextLine()) {
				str = scanner.nextLine();
				if(stlist.contains(str)){
	                scanner.nextLine();
	                scanner.nextLine();
	                scanner.nextLine();
	                quan  = Integer.parseInt(scanner.nextLine());
					if(hmap.containsKey(str)){
						hmap.put(str,hmap.get(str) + quan);
					}else {
						hmap.put(str,quan);
					}
				}
			}
			
			//System.out.println(hmap.toString());
			
			Iterator<Entry<String, Integer>> itr = hmap.entrySet().iterator();
			
			List<Flavor> flist = new ArrayList<Flavor>();
			
			Flavor fvr;
			
            while(itr.hasNext()) {           	
              fvr = new Flavor(); 
              Entry<String, Integer> e = itr.next();
              fvr.setName(e.getKey());
              fvr.setStock(e.getValue());
              flist.add(fvr);        	
            }
            
            Collections.sort(flist,new FlavorComparator());
            
            for(Flavor f : flist) {
            	 System.out.println(f.toString());
            }                 

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}