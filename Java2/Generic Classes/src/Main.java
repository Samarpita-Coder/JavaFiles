import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
		Item <Integer> item1 = new Item<Integer>();
		Item <String> item2 = new Item<String>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer :");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		
		item1.setData(num);
		item2.setData(str);
		
		System.out.println("Integer Value :"+item1.getData());
		System.out.println("String Value :"+item2.getData());
	}
}