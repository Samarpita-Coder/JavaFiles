import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of halls:");
		int num = Integer.parseInt(sc.nextLine());
		List<Hall> list = new ArrayList<Hall>();
		for(int i=0; i<num; i++) {
			String rec = sc.nextLine();
			String val[]=rec.split(",");
			Hall hall = new Hall(val[0],val[1],Double.parseDouble(val[2]),val[3]);
			list.add(hall);
			hall=null;
			rec=null;
			val=null;
		}
		Hall.writeHallDetails(list);
		
	}
}
