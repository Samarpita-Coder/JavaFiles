import java.util.Date;

public class Flight {

   public String clientName, idProof;
   public Date flightschedule;
   
   public Flight(String clientName, String idProof, Date flightschedule){
       this.clientName=clientName;
       this.idProof=idProof;
       this.flightschedule=flightschedule;
   }
   
   public String getClientName(){
       return clientName;
   }
   
   public String getIdProof(){
       return idProof;
   }
   
   public Date getFlightschedule(){
       return flightschedule;
   }
	
}