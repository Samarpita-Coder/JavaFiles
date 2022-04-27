import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		String startDate, endDate;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the stage event start date and end date");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
		
		
		try {
			startDate=scanner.nextLine();
			
			Date date1 = (Date) sdf.parse(startDate);
			endDate=scanner.nextLine();
			Date date2 =  (Date) sdf.parse(endDate);
			
			System.out.println("Start date:"+sdf.format(date1));
			System.out.println("End date:"+sdf.format(date2));
		}catch (ParseException prsExp) {
			System.out.println("'Input dates should be in the format dd-MM-yyyy-HH:mm:ss'");
		}
	}

}
