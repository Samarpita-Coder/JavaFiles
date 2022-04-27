import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your choice\n1.Exhibition\n2.StageEvent");
		String eventType=sc.nextLine();
		
		Event event=null;	//reference that of Event...object (Exhibition) defined later
		if(Integer.parseInt(eventType.trim())==1){
			System.out.println("Enter the details in CSV format");
			String input=sc.nextLine();
			String[] inputs=input.split(",");
			
			event=new Exhibition(inputs[0].trim(), inputs[1].trim(), inputs[2].trim(), inputs[3].trim(), Integer.parseInt(inputs[4].trim()), Double.parseDouble(inputs[5].trim()));
            System.out.println("Exhibition Details");
            System.out.println("Event Name:"+event.getName());
    	    System.out.println("Detail:"+event.getDetail());
		    System.out.println("Type:"+event.getType());
		    System.out.println("Organiser Name:"+event.getOrganiser());
		    System.out.println("Total Cost:"+String.format("%.1f", event.calculateAmount()));
		}
		else if(Integer.parseInt(eventType.trim())==2){
			System.out.println("Enter the details in CSV format");
			String input=sc.nextLine();
			String[] inputs=input.split(",");
			event=new StageEvent(inputs[0].trim(), inputs[1].trim(), inputs[2].trim(), inputs[3].trim(), Integer.parseInt(inputs[4].trim()), Double.parseDouble(inputs[5].trim()));
            System.out.println("Stage Event Details");
            System.out.println("Event Name:"+event.name);
            System.out.println("Detail:"+event.detail);
		    System.out.println("Type:"+event.type);
		    System.out.println("Organiser Name:"+event.organiser);
		    System.out.println("Total Cost:"+String.format("%.1f", event.calculateAmount()));
		}
		else{
			System.out.println("Invalid choice");
		}
			
		}
	}
	

