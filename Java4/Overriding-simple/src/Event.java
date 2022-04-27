public abstract class Event {

    String name,detail,ownerName;
    
    Event(String name, String detail, String ownerName){
    	this.name=name;
    	this.detail=detail;
    	this.ownerName=ownerName;
    }
    
    
    
    public String getName() {
		return name;
	}



	public String getDetail() {
		return detail;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public abstract Double projectedRevenue();
    

}