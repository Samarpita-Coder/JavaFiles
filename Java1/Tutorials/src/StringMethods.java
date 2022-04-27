import java.util.Scanner;
public class StringMethods {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int strlen1;
		int strlen2;
		//System.out.println("Enter first string:");
		//String str1=sc.nextLine();
		
		//System.out.println("Enter second string");
		//String str2=sc.nextLine();
		
		//strlen1=str1.length();
		//strlen2=str2.length();
		
		//System.out.println(strlen1);
		//System.out.println(strlen2);
		
		//System.out.println(str1.isEmpty()); //returns true when empty
		
		//System.out.println(str1.charAt(3));	//prints char at particular index
		
		//String str3;
		//str3=str2.concat(str1);
		//System.out.println(str3);
		
		//String str4;
		//str4=str1.substring(0,3);		//substring(begin index, upto index)
		//System.out.println(str4);     
		
		String str5, str6;
		str5="Hello";
		str6="hello";
		System.out.println(str5.equals(str6));	//gives true or false
		//if we want to ignore case
		System.out.println(str5.equalsIgnoreCase(str6));
		
		
	}

}
