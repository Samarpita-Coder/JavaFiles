
public class ContactDetailBO{
	
	public static void validate(String mobileNumber,String alternateMobileNumber)throws DuplicateMobileNumberException
    {
		
		try {
			if(mobileNumber.equalsIgnoreCase(alternateMobileNumber)) {
	    		   throw new DuplicateMobileNumberException("Mobile number and alternate mobile number are same");
	    	   }
			
		}catch(DuplicateMobileNumberException exp) {
			System.out.println(exp);
			System.exit(0);
		}
       
    	   
     public ContactDetailBO(){
    	  
     }
      
    
}

	
}
