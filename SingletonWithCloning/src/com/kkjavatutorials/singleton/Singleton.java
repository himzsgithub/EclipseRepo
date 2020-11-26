package com.kkjavatutorials.singleton;

/**
 * Singleton Class implements Cloneable
 * 
 * @author KK JavaTutorials
 */
public class Singleton implements Cloneable {

	private static Singleton INSTANCE = null;

	/*
	 * private constructor so that preventing instance creation from other class
	 */
	private Singleton() {

	}

	/**
	 * This method has global access to return Single instance within JVM
	 * 
	 * @return Singleton Instance
	 */
	public static Singleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("you cannot create clone of singleton");
	}
}
