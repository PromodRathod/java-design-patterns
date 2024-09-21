package main.structuralDesignPattern.Proxy;

public class CommandPrompt implements CommandExecutor {
	
	@Override
	public void runCommand(String cmd) {
		System.out.println("executing the command " + cmd + " in command prompt");
	}

}
