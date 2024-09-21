package main.creationalDesignPattern.AbstractFactory;

public class ServerFactory implements ComputerAbstractFactory {

	int ssdSize;
	int ramSize;
	String processor;
	
	ServerFactory(int ssd, int ram, String cpu) {
		this.ssdSize = ssd;
		this.ramSize = ram;
		this.processor = cpu;
	}

	@Override
	public Computer createComputer() {
		return new Server(this.ssdSize, this.ramSize, this.processor);
	}
}
