public abstract class Event {

    String name,detail,type,organiser;
    
    Event(String name, String detail, String type, String organiser){
    	this.name=name;
    	this.detail=detail;
    	this.type=type;
    	this.organiser=organiser;
    }
    
    
    
    public String getName() {
		return name;
	}



	public String getDetail() {
		return detail;
	}


	public String getType() {
		return type;
	}


	public String getOrganiser() {
		return organiser;
	}

	abstract Double calculateAmount();
    

}