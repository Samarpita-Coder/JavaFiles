import java.text.SimpleDateFormat;
import java.util.Date;
public class InternationalFlight extends Flight {
	
    public String passportNumber, natureOfVisit;
    
    public InternationalFlight(String clientName, String idProof, Date flightschedule, String passportNumber, String natureOfVisit){
        super(clientName, idProof, flightschedule);
        this.passportNumber=passportNumber;
        this.natureOfVisit=natureOfVisit;
        
    }
    
    public String getPassportNumber(){
        return passportNumber;
    }
    
    public String getNatureOfVisit(){
        return natureOfVisit;
    }
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public void displayFlightDetails(){
        System.out.println("Flight Details :");
        System.out.println("Name : "+clientName);
        System.out.println("ID Proof : "+idProof);
        System.out.println("Flight Schedule : "+sdf.format(flightschedule));
        System.out.println("Passport Number :"+passportNumber);
        System.out.println("Flight Schedule : "+natureOfVisit);
    }

}