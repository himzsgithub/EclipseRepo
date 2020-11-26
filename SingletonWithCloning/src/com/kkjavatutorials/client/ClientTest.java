package com.kkjavatutorials.client;

import com.kkjavatutorials.singleton.Singleton;
/**
 * Client Program getting singleton instance 
 * of Singleton class
 * @author KK JavaTutorials
 */
public class ClientTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = (Singleton) singleton1.clone();
		
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}

}
