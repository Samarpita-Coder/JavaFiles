
public class StageEvent extends Event{
	
	Integer noOfShows;
	double costPerShow;
	double product;
    
	public StageEvent(String name, String detail, String type, String organiser, Integer noOfShows,Double costPerShow) {
		super(name, detail, type, organiser);
		this.noOfShows=noOfShows;
		this.costPerShow=costPerShow;
	}

	//Fill your code here


    Double calculateAmount() {

        product=noOfShows*costPerShow;

        return product;

    }  
	
}