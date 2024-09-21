package main.creationalDesignPattern.AbstractFactory;

public interface Computer {

	public void start();
	public void performTask(String task);
	public void shutdown();
	public String toString();
}
