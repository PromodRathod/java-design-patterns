package main.creationalDesignPattern.Factory;

public class Server implements Computer {
	
	int ssdSize;
	int ramSize;
	String processor;
	
	Server(int ssd, int ram, String cpu) {
		this.ssdSize = ssd;
		this.ramSize = ram;
		this.processor = cpu;
	}

	@Override
	public void start() {
		System.out.println("Server has started");
	}

	@Override
	public void performTask(String task) {
		System.out.println("Server performing task : " + task);
	}

	@Override
	public void shutdown() {
		System.out.println("Server has shutdown");
	}
	
	public void broadcastMessageToPeerServers(String msg) {
		System.out.println("Broadcasting Message to all connected peer servers");
	}
	
	@Override
	public String toString() {
		return "Computer type : Server, ssdSize : " + this.ssdSize + ", ramSize : " + this.ramSize + ", processor : " + this.processor;
	}

}
