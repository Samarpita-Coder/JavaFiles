public class ExecutiveStall implements Stall{
	
	String stallName, ownerName;
	Integer cost, screen;

	ExecutiveStall(String stallName, Integer cost, String ownerName, Integer screen){
		this.stallName=stallName;
		this.cost=cost;
		this.ownerName=ownerName;
		this.screen=screen;
		
	}
	
	public void dispplay() {
		System.out.println("Stall Name: "+stallName);
		System.out.println("Cost: Rs."+cost);
		System.out.println("Owner Name: "+ownerName);
		System.out.println("Number of Screens: "+screen);
		
	}
	//fill your code here
}
