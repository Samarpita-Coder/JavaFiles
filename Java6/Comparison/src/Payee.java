
public class Payee {
    private String name;
	private String bankName;
	private String ifscCode;
	private String aadharId;
	private Double amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getAadharId() {
		return aadharId;
	}
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public Payee addPayee(String name,String bankName,String ifscCode,Double depositeAmount) {
		if((this.name).equals(name) && (this.bankName).equals(bankName) && (this.ifscCode).equals(ifscCode)){
           
            System.out.println("Amount deposited successfully");
            System.out.println("Current balance of "+this.name+" account is "+(this.getAmount()+depositeAmount));
            Payee p = new Payee();
//            p.setName(name);
//            p.setAadharId(null);
//            p.setAmount(depositeAmount);
//            p.setBankName(bankName);
//            p.setIfscCode(ifscCode);
//            return p;
            
		}else{
    	    System.out.println("Payee not found from given match");
		}
		return null;
	}
	
	public Payee addPayee(String aadharid,String IfscCode,Double depositeAmount) {
		if((this.aadharId).equals(aadharid) && (this.ifscCode).equals(ifscCode)){
			System.out.println("Amount deposited successfully");
            System.out.println("Current balance of "+this.name+" account is "+(this.getAmount()+depositeAmount));
            
		}else{
    	    System.out.println("Payee not found from given match");
		}
		return null;
	}
}
	
