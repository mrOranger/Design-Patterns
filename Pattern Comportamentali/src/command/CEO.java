package command;

public class CEO extends Impiegato{

	private Command command;
	
	public CEO(String name, String surname, String id) {
		super(name, surname, id);
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void execute(Impiegato imp) {
		this.command.esegui(imp);
	}
}
