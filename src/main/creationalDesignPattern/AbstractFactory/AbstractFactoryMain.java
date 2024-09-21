package main.creationalDesignPattern.AbstractFactory;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		System.out.println("Client side running.....");
		Computer pc = ComputerFactory.getComputer(new PCFactory(1024, 8, "Inter i7, 7th Gen"));
		Computer server = ComputerFactory.getComputer(new ServerFactory(5120, 32, "Inter i9, 9th Gen"));
		System.out.println("PC details are : " + pc.toString());
		System.out.println("Server details are : " + server.toString());
	}
}

