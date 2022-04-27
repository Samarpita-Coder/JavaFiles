
import java.io.*;
	import java.text.SimpleDateFormat;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception{
	        
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the client name");
	        String name=sc.nextLine();
	        System.out.println("Enter the id proof");
	        String id=sc.nextLine();
	        System.out.println("Enter the flight schedule");
	        String date=sc.nextLine();
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	        Date date2= (Date) sdf.parse(date);
	        //String date3=sdf.format(date2);
	        //Date date4=sdf.parse(date3);
	        //Date flightSchedule=new SimpleDateFormat("dd/MM/yyyy").parse(date);
	        //Date fs=new SimpleDateFormat("dd/MM/yyyy").format(flightSchedule);
	        System.out.println("Enter the passport number");
	        String pass=sc.nextLine();
	     	System.out.println("Enter the nature of visit");
	        String nature=sc.nextLine();
			
			//Create reference to Flight class and assign the instance of InternationalFlight class to it
	        
	        InternationalFlight flight = new InternationalFlight(name,id,date2,pass,nature);
	        flight.displayFlightDetails();
		}
	}


