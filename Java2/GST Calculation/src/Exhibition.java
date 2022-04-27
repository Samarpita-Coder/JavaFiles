class Exhibition extends Event {
	
    static Integer gst = 5;
    Integer noOfStalls;
    double cost;
   
    public Exhibition(String name, String type, Double costPerDay, Integer noOfDays, Integer noOfStalls) {
    	super(name,type,costPerDay,noOfDays);
    	this.noOfStalls=noOfStalls;
    }


	public Double totalCost() {

       cost=(costPerDay*noOfDays)+(0.05*(costPerDay*noOfDays));
       
       return cost;
    }


	public Integer getNoOfStalls() {
		return noOfStalls;
	}


    
    
}