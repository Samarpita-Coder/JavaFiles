import java.util.Scanner;
public class Main{ 
	public static void main (String[] args) { 	
		Scanner sc=new Scanner(System.in);
		String str1,str2,constr;
		System.out.println("Enter the first string :");
		str1=sc.nextLine();
		System.out.println("Enter the second string :");
		str2=sc.nextLine();
		System.out.println("Substring :"+str1.substring(3));
		System.out.println("The character at 3rd position in the second string is :"+str2.charAt(3));
		System.out.println("Are string 1 and string 2 equal? : "+str1.equalsIgnoreCase(str2));
		constr=str1.concat(str2);
		System.out.println("Concatenated string :"+constr);
			
	}
		
	 
} 



