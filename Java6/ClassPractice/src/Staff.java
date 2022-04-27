
public class Staff {
	private String name;
	private String dept;
	private int tcode;
	
	public Staff(String n, String d, int c) {
		this.setName(n);
		this.setDept(d);
		this.setTcode(c);
	}
	
	public void setName(String nam) {
		name=nam;
	}
	
	public void setDept(String dep) {
		dept=dep;
	}
	
	public void setTcode(int cod) {
		tcode=cod;
	}
	
	
}
