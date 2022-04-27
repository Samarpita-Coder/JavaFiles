import java.util.*;
import java.io.*;
//static method- only one copy of method in class
public class UserBO {
    public static void writeFile(ArrayList<User> userList, BufferedWriter bw) throws Exception {
        for(int i=0; i<userList.size(); i++) {
        	String rec = (userList.get(i)).getName()+","+userList.get(i).getMobileNumber()+","+userList.get(i).getUsername()+","+userList.get(i).getPassword()+"\n";
        	bw.write(rec);
        	bw.flush();
        }
        bw.close();
    }
}