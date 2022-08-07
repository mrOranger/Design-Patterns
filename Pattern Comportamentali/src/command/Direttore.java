package command;

public class Direttore extends Impiegato{
	
	private Command command;
	
	public Direttore(String name, String surname, String id) {
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
