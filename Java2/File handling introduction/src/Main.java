import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		
		List<User> userList = null;
		
		FileReader fr = new FileReader("C:\\Users\\samarpita.mahadani\\eclipse-workspace\\File handling introduction\\src\\input.csv");
		BufferedReader br = new BufferedReader(fr);
		UserBO ub = new UserBO();
		try {
			userList = ub.readFromFile(br);
			//System.out.println(userList.size());
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			br.close();
		}
		
		if(userList.isEmpty()) {
			System.out.println("The list is empty");
		}else {
			String name = "Name", email="Email", username="Username", password="Password";
			System.out.printf("%-15s %-20s %-15s %s\n", name, email, username, password);
			ub.display(userList);
		}
	}
}
