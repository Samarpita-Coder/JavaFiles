public class BankFactory {
	
	public ICICI getIcici() {
		return new ICICI();
		
	}
	
	public HDFC getHdfc() {
		return new HDFC();
	}

}