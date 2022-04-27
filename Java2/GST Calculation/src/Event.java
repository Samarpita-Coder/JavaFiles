class Event{
    
    String name,type;
    double costPerDay;
    Integer noOfDays;
    
    public Event(String name, String type, Double costPerDay, Integer noOfDays) {
    	this.name=name;
    	this.type=type;
    	this.costPerDay=costPerDay;
    	this.noOfDays=noOfDays;
    	
    	
    }

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public Integer getNoOfDays() {
		return noOfDays;
	}

}