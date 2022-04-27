import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter event name");
    	String name=sc.nextLine();
        System.out.println("Enter the cost per day");
        double costPerDay=sc.nextDouble();
        System.out.println("Enter the number of days");
        int noOfDays=sc.nextInt();
        System.out.println("Enter the type of event\n1.Exhibition\n2.Stage Event");
        int type=sc.nextInt();
        
       
        if(type==1){
           
           System.out.println("Enter the number of stalls");
            int noOfStalls=sc.nextInt();
            Exhibition event = new Exhibition(name,"Exhibition",costPerDay,noOfDays,noOfStalls);
            System.out.println("Event Details");
            System.out.println("Name:"+event.getName());
            System.out.println("Type:"+event.getType());
            System.out.println("Number of stalls:"+event.getNoOfStalls());
            System.out.println("Total amount:"+String.format("%.2f",event.totalCost()));
        }
        else if(type==2){
            System.out.println("Enter the number of seats");
            int noOfSeats=sc.nextInt();
            StageEvent event = new StageEvent(name,"Stage Event", costPerDay,noOfDays,noOfSeats);
            System.out.println("Event Details");
            System.out.println("Name:"+event.getName());
            System.out.println("Type:"+event.getType());
            System.out.println("Number of seats:"+event.getNoOfSeats());
            System.out.println("Total amount:"+String.format("%.2f",event.totalCost()));
        }
        else{
            System.out.println("Invalid input");   
        }
        
    }
}