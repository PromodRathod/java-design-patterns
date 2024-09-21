package main.structuralDesignPattern.Proxy;

public class ProxyMain {

	public static void main(String[] args) {
		CommandPromptProxy proxy = new CommandPromptProxy("test", "randomguess");
		proxy.runCommand("rm demo.txt");
		proxy.runCommand("cd ..");
		proxy.getPrivilageAccess("testing");
		proxy.runCommand("rm demo.txt");
	}
}
