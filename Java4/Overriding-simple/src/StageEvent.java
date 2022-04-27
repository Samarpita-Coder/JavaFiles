class StageEvent extends Event {
	
	double revenue;
	Integer noOfShows,noOfSeatsPerShow;
	
	StageEvent(String name, String detail, String ownerName, Integer noOfShows, Integer noOfSeatsPerShow){
		super(name,detail,ownerName);
		this.noOfShows=noOfShows;
		this.noOfSeatsPerShow=noOfSeatsPerShow;
	}
	
	public Double projectedRevenue() {
		revenue=50*noOfSeatsPerShow*noOfShows;
		return revenue;
	}

      
          //your code here
}