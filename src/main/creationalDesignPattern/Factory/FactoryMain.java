package main.creationalDesignPattern.Factory;

import java.util.Optional;

public class FactoryMain {

	public static void main(String[] args) {
		System.out.println("Client side running.....");
		Optional<Computer> pc = ComputerFactory.getComputer("PC", 1024, 8, "Inter i7, 7th Gen");
		Optional<Computer> server = ComputerFactory.getComputer("Server", 5120, 32, "Inter i9, 9th Gen");
		if (pc.isPresent())	System.out.println("PC details are : " + pc.get().toString());
		if (server.isPresent())	System.out.println("Server details are : " + server.get().toString());
	}
}

