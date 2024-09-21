package main.creationalDesignPattern.Factory;

import java.util.Optional;

public class ComputerFactory {

	public static Optional<Computer> getComputer(String computerType, int ssd, int ram, String cpu) {
		if (computerType == "Server") return Optional.of(new Server(ssd, ram, cpu));
		else if (computerType == "PC") return Optional.of(new PC(ssd, ram, cpu));
		else return Optional.empty();
	}
}
