//user defined exception
public class BankAccount {
	
	float bal=30000;
	
	public void withdraw(float amt) throws NegativeBalException {
		
		try {
			if(amt>bal) {
				throw new NegativeBalException("Insufficient Balance");
			}else {
				bal=bal-amt;
				System.out.println(bal);
			}
		} catch(NegativeBalException nbExcp) {
			System.out.println(nbExcp.getMessage());
		}
		
	}	
}
