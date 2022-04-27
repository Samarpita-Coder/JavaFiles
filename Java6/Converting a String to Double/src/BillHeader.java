import java.text.SimpleDateFormat;
import java.util.Date;

public class BillHeader {
	Date issueDate, dueDate;
	Double originalAmount, amountOutstanding;
	//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public Date getIssueDate() {
		return issueDate;	//String
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;	//Date
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Double getOriginalAmount() {
		return originalAmount;
	}
	public void setOriginalAmount(Double originalAmount) {
		this.originalAmount = originalAmount;
	}
	public Double getAmountOutstanding() {
		return amountOutstanding;
	}
	public void setAmountOutstanding(Double amountOutstanding) {
		this.amountOutstanding = amountOutstanding;
	}
	
}