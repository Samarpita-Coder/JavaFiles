//Date (object) will give the current date
//SimpleDateFormat (object) will format the date
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class DateAndTime {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		//format()- a method of SimpleDateFormat class
		System.out.println(dateFormat.format(date));
		/*parse()- method of SimpleDateFormat class that will convert String to Date type (according
		 * to the format given in the argument of SimpleDateFormat*/
		String date2 = "13 06 2004";
		try{
			System.out.println(dateFormat.parse(date2));
			System.out.println(dateFormat.format(dateFormat.parse(date2)));
		}catch(ParseException prs) {
			System.out.println(prs.getMessage());
		}
	
		

	}

}
