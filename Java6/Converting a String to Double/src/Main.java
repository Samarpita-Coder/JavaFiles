import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws ParseException {
    	Scanner sc = new Scanner(System.in);
		
    	System.out.println("Enter the issue date as dd/MM/yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date issueDate = sdf.parse(sc.nextLine());
		
		System.out.println("Enter the due date as dd/MM/yyyy");
		Date dueDate = sdf.parse(sc.nextLine());	//Date
		
		System.out.println("Enter the original amount");
		Double orAmt = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter amount paid so far");
		Double paidAmt = Double.parseDouble(sc.nextLine());
		
		BillHeader bh = new BillHeader();
		
		bh.setIssueDate(issueDate);
		bh.setDueDate(dueDate);
		bh.setOriginalAmount(orAmt);
		
		System.out.println("Issue date: "+sdf.format(bh.getIssueDate()));
		System.out.println("Due Date: "+sdf.format(bh.getDueDate()));
		System.out.println("Original amount Rs."+String.format("%.1f", bh.getOriginalAmount()));
		System.out.println("Amount outstanding Rs."+String.format("%.1f", (bh.getOriginalAmount()-paidAmt)));
	}
}