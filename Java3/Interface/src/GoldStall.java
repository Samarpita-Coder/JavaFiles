public class GoldStall implements Stall{
	
	String stallName, ownerName;
	Integer cost, tvSet;
	
	GoldStall(String stallName, Integer cost, String ownerName, Integer tvSet){
		this.stallName=stallName;
		this.cost=cost;
		this.ownerName=ownerName;
		this.tvSet=tvSet;
	}
	
	
	public String getStallName() {
		return stallName;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public Integer getCost() {
		return cost;
	}


	public Integer getTvSet() {
		return tvSet;
	}


	public void dispplay() {
		System.out.println("Stall Name: "+stallName);
		System.out.println("Cost: Rs."+cost);
		System.out.println("Owner Name: "+ownerName);
		System.out.println("Number of TV sets: "+tvSet);
		
	}
	
	
}

