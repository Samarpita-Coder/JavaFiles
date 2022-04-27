
class Exhibition extends Event {
	
	Integer noOfStalls;
	double revenue;
      
	Exhibition(String name, String detail, String ownerName, Integer noOfStalls){
		super(name,detail,ownerName);
		this.noOfStalls=noOfStalls;
	}

	public Double projectedRevenue() {
		revenue=10000*noOfStalls;
		return revenue;
	}
}