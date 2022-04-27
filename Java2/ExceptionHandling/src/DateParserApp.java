import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class DateParserApp {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
		String startDate="04-05 2003";
		String endDate="07 07 1992";
		
		try {
			Date date1 = (Date) sdf.parse(startDate);
			Date date2 =  (Date) sdf.parse(endDate);
			System.out.println(date1);
			System.out.println(date2);
		}catch (ParseException prsExp) {
			prsExp.printStackTrace();
		}
	}

}
