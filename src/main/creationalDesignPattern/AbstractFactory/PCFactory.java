package main.creationalDesignPattern.AbstractFactory;

public class PCFactory implements ComputerAbstractFactory {

	int ssdSize;
	int ramSize;
	String processor;
	
	PCFactory(int ssd, int ram, String cpu) {
		this.ssdSize = ssd;
		this.ramSize = ram;
		this.processor = cpu;
	}

	@Override
	public Computer createComputer() {
		return new PC(this.ssdSize, this.ramSize, this.processor);
	}
	
	
}
