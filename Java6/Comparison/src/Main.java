import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Enter the bankname");
        String bankName=sc.nextLine();
        System.out.println("Enter the IFSC Code");
        String ifscCode=sc.nextLine();
        System.out.println("Enter the aadhar id");
        String aadharid=sc.nextLine();
        System.out.println("Enter the amount");
        Double amt=Double.parseDouble(sc.nextLine());
        
        System.out.println("1)Pay using name, bankname and IFSC code");
        System.out.println("2)Pay using aadharid and IFSC code");
        System.out.println("Enter your choice");
        
        int choice = Integer.parseInt(sc.nextLine());
        
        Payee p1 = new Payee();
        p1.setName(name);
        p1.setBankName(bankName);
        p1.setIfscCode(ifscCode);
        p1.setAadharId(aadharid);
        p1.setAmount(amt);
        
        if(choice==1){
            System.out.println("Enter the payee account name");
            String name2=sc.nextLine();
            System.out.println("Enter their bankname");
            String bankName2=sc.nextLine();
            System.out.println("Enter their IFSC Code");
            String ifscCode2=sc.nextLine();
            System.out.println("Enter the amount to deposite");
            Double amt2=Double.parseDouble(sc.nextLine());
            p1.addPayee(name2,bankName2,ifscCode2,amt2);
        }else{
            System.out.println("Enter the payee aadharid");
            String id2=sc.nextLine();
            System.out.println("Enter their IFSC Code");
            String ifscCode2=sc.nextLine();
            System.out.println("Enter the amount to deposite");
            Double amt2=Double.parseDouble(sc.nextLine());
            p1.addPayee(id2,ifscCode2,amt2);
        }
        
       
        
        
       
        

	}

}
