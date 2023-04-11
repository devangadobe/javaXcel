package com.hfjava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationClass {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Foo foo = new Foo();
		
		foo.height = 50;
		foo.width = 60;
		foo.fvr = new Flavor();
		foo.fvr.setName("Rose");
		foo.name = "foo1";
		
		FileOutputStream fos = new FileOutputStream("foo.ser");		
		ObjectOutputStream oos = new ObjectOutputStream(fos);		
		oos.writeObject(foo);
		
		oos.close();
		
		/* now the input stream and deserialization */
		
		FileInputStream fis = new FileInputStream("foo.ser");
		ObjectInputStream ois  = new ObjectInputStream(fis);
		Foo fooBack = (Foo) ois.readObject();
		System.out.println(fooBack.toString());
		
		ois.close();

		
	}

}
