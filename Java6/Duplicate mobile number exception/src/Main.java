import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws DuplicateMobileNumberException{
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the contact details");
        String st=sc.nextLine();
        String[] str=st.split(",");
        ContactDetail contactDetail = new ContactDetail(str[0],str[1],str[2],str[3],str[4]);
        /*contactDetail.setAddress(str[4]);
        contactDetail.setAlternateMobileNumber(str[1]);
        contactDetail.setEmail(str[3]);
        contactDetail.setLandline(str[2]);
        contactDetail.setMobileNumber(str[0]);*/
        
		
        ContactDetailBO cdBO = new ContactDetailBO();
        try {
        	cdBO.validate(str[0],str[1]);
        }
        
        System.out.println(contactDetail);
        	
       
    
	}
}
