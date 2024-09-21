package main.creationalDesignPattern.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		System.out.println("first instance call : " + SingletonLogger.instance().hashCode());
		System.out.println("second instance call : " + SingletonLogger.instance().hashCode());
	}
}
