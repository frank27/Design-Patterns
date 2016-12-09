package supermarket.spanishConfiguration;

import supermarket.Menu;

public class SpanishMenu extends Menu
{
	@Override
	protected void setCommands() {
		commandList.add(new SaleLineCommand());
		commandList.add(new RepetitionLineCommand());
		commandList.add(new ReturnLineCommand());
		commandList.add(new CancellationLineCommand());
		
	}

}
