import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
	
		public static void main(String[] args) throws ParseException {
			
		//Date today = new Date()- will give current date

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date today = new Date();
		String str = sdf.format(today); //format- date to string
		System.out.println((str));
		
		//input date from user   		//parse- string to date
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
		Date date = sd.parse("04-05-2003");
		System.out.println(date);
		
		
	}

}
