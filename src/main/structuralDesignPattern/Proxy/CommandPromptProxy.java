package main.structuralDesignPattern.Proxy;

public class CommandPromptProxy implements CommandExecutor {

	private CommandExecutor cmd;
	private boolean isRemoteServerPrompt = false;
	
	CommandPromptProxy(String userName, String password) {
		cmd = new CommandPrompt();
		if (userName.equals("test") && password.equals("testing")) 
			isRemoteServerPrompt = true;
	}
	
	public void getPrivilageAccess(String pwd) {
		if (pwd.equals("testing")) isRemoteServerPrompt = true;
		else System.out.println("Wrong Password");
	}

	@Override
	public void runCommand(String cmd) {
		if (cmd.contains("rm") && !this.isRemoteServerPrompt) System.err.println("Admin rights required!!!");
		else this.cmd.runCommand(cmd);
	}
}
