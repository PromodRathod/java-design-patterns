package main.creationalDesignPattern.Factory;

public class PC implements Computer {
	
	int ssdSize;
	int ramSize;
	String processor;
	
	PC(int ssd, int ram, String cpu) {
		this.ssdSize = ssd;
		this.ramSize = ram;
		this.processor = cpu;
	}

	@Override
	public void start() {
		System.out.println("PC has started");
	}

	@Override
	public void performTask(String task) {
		System.out.println("PC performing task : " + task);
	}

	@Override
	public void shutdown() {
		System.out.println("PC has shutdown");
	}
	
	public String toString() {
		return "Computer type : PC, ssdSize : " + this.ssdSize + ", ramSize : " + this.ramSize + ", processor : " + this.processor;
	}

}
