import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(read);
		System.out.println("Enter the number of users:");
		int user = Integer.parseInt(br.readLine());
		ArrayList<Address> al = new ArrayList<Address>();
		
		System.out.println("Enter user address in CSV(Username,AddressLine 1,AddressLine 2,PinCode)");
		
		for(int i=0; i<user; i++) {
			//String[] arr = new String[4];
			String inp = br.readLine();
			String[] arr=inp.split(",");
			//Integer pinCode=Integer.parseInt(arr[3]);
			al.add(new Address(arr[0],arr[1],arr[2],Integer.parseInt(arr[3])));
			
		}
		
		Collections.sort(al);
		System.out.println("User Details:");
		for(Address ad:al) {
			System.out.println(ad.getUsername()+","+ad.getAddressLine1()+","+ad.getAddressLine2()+","+ad.getPinCode());
		}
	}
}
