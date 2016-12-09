package supermarket.menu;

import supermarket.Command;
import supermarket.LimitedIntDialog;

public class SaleLineCommand extends Command{

	protected SaleLineCommand() {
		super("Linea de Venta");
	}

	@Override
	public void execute() {
		int id = LimitedIntDialog.instance().read("Código", 1000);
		int units = LimitedIntDialog.instance().read("Unidades", 1000);
		ticket.add(new SaleLine(id,units));
		
	}
	
}
