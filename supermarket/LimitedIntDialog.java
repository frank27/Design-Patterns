package supermarket;

public class LimitedIntDialog {

	private static LimitedIntDialog limitedIntDialog;
	
	public static LimitedIntDialog instance() {
		if(limitedIntDialog == null) {
			limitedIntDialog = new LimitedIntDialog();
		}
		return limitedIntDialog;
	}

	public int read(String string, int i, int size) {
		// TODO Auto-generated method stub
		return 0;
	}

}
