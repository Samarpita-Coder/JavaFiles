import java.io.*;
import java.util.*;

public class UserBO {
	List<User> list = new ArrayList<User>();
	String str = new String();

	public List<User> readFromFile(BufferedReader br) throws IOException {
		while ((str = br.readLine()) != null) {
			// str=str+br.readLine();
			String records[] = str.split("\n");
			for (int i = 0; i < records.length; i++) {
				String values[] = (records[i]).split(",");
				// System.out.println(values[0]);
				User user = new User();
				user.setName(values[0]);
				user.setEmail(values[1]);
				user.setUsername(values[2]);
				user.setPassword(values[3]);
				list.add(user);
				values = null;

			}
		}
		return list;
	}

	public void display(List<User> list) {
		for(User user: list) {
			System.out.printf("%-15s %-20s %-15s %s\n", user.getName(), user.getEmail(), user.getUsername(), user.getPassword());
		}
	}
}