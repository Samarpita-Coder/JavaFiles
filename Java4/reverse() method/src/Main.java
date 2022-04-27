import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Scanner;
public class Main {
	public static void main(String args[]) throws IOException {
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(read);
		System.out.println("Enter the number of users:");
		//Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(br.readLine());
		ArrayList <User> al = new ArrayList<User>();
		String arr[]=null;
		for(int i=1; i<=num; i++) {
			
			System.out.println("Enter the details of User "+i);
			String user = br.readLine();
			arr=user.split(",");
			al.add(new User(arr[0],arr[1],arr[2],arr[3]));
			arr=null;
			
		}
		
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("The user details in reverse order:");
		System.out.println("Name           Mobile number");
		for(User u:al) {
			System.out.println(u);
		}
		
		
	}
}
