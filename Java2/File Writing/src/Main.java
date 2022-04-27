import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of users:");
		int num = Integer.parseInt(sc.nextLine());
		ArrayList<User> al = new ArrayList<User>();
		FileWriter fw = new FileWriter("output.csv");
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=1; i<=num; i++) {
			System.out.println("Enter the details of user :"+i);
			String record = sc.nextLine();
			String  values[]=record.split(",");
			User user = new User(values[0],values[1],values[2],values[3]);
			al.add(user);
			user=null;
		}
		try {
			UserBO.writeFile(al, bw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
