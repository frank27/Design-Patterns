package supermarket.frenchConfiguration;

import supermarket.Menu;

public class FrenchMenu extends Menu
{
	@Override
	protected void setCommands() {
		commandList.add(new SaleLineCommand());
		commandList.add(new RepetitionLineCommand());
		commandList.add(new CancellationLineCommand());
		
	}

}
