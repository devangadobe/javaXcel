package com.hfjava;
import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
      
		Flavor f1 = new Flavor();
		Flavor f2 = new Flavor();
		Flavor f3 = new Flavor();
		Flavor f4 = new Flavor();
		
		f1.setName("F1");
		f2.setName("F2");
		f1.setStock(10);
		f3.setName("F3");
		f3.setStock(4);
		f4.setName("F4");
		f4.setStock(5);
		
		
		List<Flavor> flist = List.of(f1,f2,f3,f4);
		
		//flist.sort((f,h)->f.getName().compareTo(h.getName()));
		
		flist.stream().limit(3).forEach(f -> System.out.println(f.getName()));
		
		System.out.println(flist.stream()
				.limit(2)
				.count());
		
		System.out.println(flist.stream()
				.distinct()
				.sorted()
				.skip(1)
				.limit(3)
				.filter(f->f.getStock() > 4)
				.map(f->f.getName())
				.collect(Collectors.toList()));
		
		System.out.println(flist.stream()
				.distinct()
				.sorted()
				.skip(1)
				.limit(3)
				.filter(f->f.getStock() > 4)
				.map(f->f.getName())
				.findFirst().isEmpty());
		
		System.out.println(flist.stream()
				.filter(f->f.getStock() > 4)
				.map(f->f.getName())
				.findFirst().get());
				
		
	}

}
