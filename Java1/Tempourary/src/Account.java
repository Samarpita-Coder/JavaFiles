import java.sql.Date;

public class Account {
	
	String name, accountName;
	double balance;
	java.util.Date startDate;
	float maintenance;
	
	Account(String name, String accountNumber, Double balance, java.util.Date date){
		this.name=name;
		this.balance=balance;
		this.startDate=date;
	
	}
}


