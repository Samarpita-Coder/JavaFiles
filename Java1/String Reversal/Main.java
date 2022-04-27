import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		String user = sc.nextLine();
		String display ="";
		for(int i=user.length()-1; i>=0; i--) {
			display=display+user.charAt(i);
		}
		System.out.println("Reverse of the string is "+display);
	}
}