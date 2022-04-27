public class Exhibition extends Event {
 
    Integer noOfStalls;
    double  rentPerStall;
    double amount;
    
    public Exhibition(String name, String detail, String type, String organiser, Integer noOfStalls,Double rentPerStall) {
    	super( name, detail, type, organiser);
    	this.noOfStalls=noOfStalls;
    	this.rentPerStall=rentPerStall;
    }

    Double calculateAmount() {

        amount=noOfStalls*rentPerStall;
        return amount;
    }
     	
}