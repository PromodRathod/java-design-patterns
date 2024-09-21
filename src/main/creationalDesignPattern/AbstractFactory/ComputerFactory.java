package main.creationalDesignPattern.AbstractFactory;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory compFact) {
		return compFact.createComputer();
	}
}
