public class PremiumStall implements Stall{
	
	String stallName, ownerName;
	Integer cost, projector;
	
	PremiumStall(String stallName, Integer cost, String ownerName, Integer projector){
		this.stallName=stallName;
		this.ownerName=ownerName;
		this.cost=cost;
		this.projector=projector;
	}
	
	public void dispplay() {
		System.out.println("Stall Name: "+stallName);
		System.out.println("Cost: Rs."+cost);
		System.out.println("Owner Name: "+ownerName);
		System.out.println("Number of Projectors: "+projector);
		
	}
	
	
}
