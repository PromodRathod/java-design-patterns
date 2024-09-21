package main.creationalDesignPattern.singleton;

import main.creationalDesignPattern.singleton.SingletonLogger;

public class SingletonLogger {

	private static class SingletonLoggerClass {
		private final static SingletonLogger INSTANCE = new SingletonLogger();
	}
	
	private SingletonLogger() {}
	
	public static SingletonLogger instance() {
		return SingletonLoggerClass.INSTANCE;
	}
}

