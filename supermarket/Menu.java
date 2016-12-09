package supermarket;

import java.util.ArrayList;
import java.util.List;

public abstract class Menu {
	
	protected List<Command> commandList;
	
	private ExitCommand exitCommand;

	public Menu() {
		this.commandList = new ArrayList<Command>();
		this.setCommands();
		exitCommand = new ExitCommand();
		this.commandList.add(exitCommand);
	}

	protected abstract void setCommands();
	
	protected void set(Ticket ticket) {
		for(Command command:commandList) {
			command.set(ticket);
		}
	}
	
	public void execute(Ticket ticket) {
		this.set(ticket);
		exitCommand.reset();
		do {
			this.write();
			int option = this.getOption();
			commandList.get(option).execute();
		} while(!exitCommand.closed());
	}

	private int getOption() {
		return LimitedIntDialog.instance().read("Opción",1,commandList.size());
	}

	private void write() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("---------------------------");
		for(int i=0; i<commandList.size();i++) {
			System.out.println((i+1)+". "+commandList.get(i).getTitle());
		}
		
	}

}
