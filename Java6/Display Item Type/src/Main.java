import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                ItemType s1=new ItemType();
              

                System.out.println("Enter the item type name");
                String name=sc.nextLine();
                s1.setName(name);

                System.out.println("Enter the cost per day");
                double costPerDay=sc.nextDouble();
                s1.setCostPerDay(costPerDay);

                System.out.println("Enter the deposit");
                double deposit=sc.nextDouble();
                s1.setDeposit(deposit);

                s1.display();
    }
}