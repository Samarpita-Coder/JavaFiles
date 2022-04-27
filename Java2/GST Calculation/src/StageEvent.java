class StageEvent extends Event{
	
	static Integer gst = 15;
    Integer noOfSeats;
    double cost;

	public StageEvent(String name, String type, Double costPerDay, Integer noOfDays, Integer noOfSeats) {
		super(name,type,costPerDay,noOfDays);
		this.noOfSeats=noOfSeats;
	}

	
    public Double totalCost() {

       cost=(costPerDay*noOfDays)+(0.15*(costPerDay*noOfDays));
        
        return cost;
    }


	public Integer getNoOfSeats() {
		return noOfSeats;
	}


   
}