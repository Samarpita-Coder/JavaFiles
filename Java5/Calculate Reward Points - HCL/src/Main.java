import java.util.Scanner;
import java.io.IOException;
public class Main { 
    public static void main(String[] args) throws IOException { 
        
    Scanner sc=new Scanner(System.in);
    
  
    String contd;
    do{
        System.out.println("Enter the transaction detail");
        String input=null;
        input=sc.nextLine();		//takes the strings as inputs separated by comma
        String[] inputs=input.split(",");	//makes an array of the strings
        if(inputs[2].equals("VISA card")){
           VISACard visaCard=new VISACard();
           double reward=visaCard.computeRewardPoints(inputs[0],Double.parseDouble(inputs[1]));
           													//this will convert the string to double
           System.out.println("Total reward points earned in this transaction is "+String.format("%.2f",reward));
        }
        else if(inputs[2].equals("HPVISA card")){
            VISACard visaCard=new HPVISACard();
            double reward=visaCard.computeRewardPoints(inputs[0],Double.parseDouble(inputs[1]));
           
            System.out.println("Total reward points earned in this transaction is "+String.format("%.2f",reward));
        }
        else{
            System.out.println("Invalid data");
        }
        System.out.println("Do you want to continue?(Yes/No)");
        contd=sc.nextLine();
    
    }
    while(contd.equalsIgnoreCase("Yes"));
    } 
}