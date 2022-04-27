

public abstract class CreditCard {
	protected
	String cardNumber;
	String cardType;
	String holderName;
	public CreditCard(String name,String num, String type) {
		this.holderName=name;
		this.cardNumber=num;
		this.cardType=type;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public abstract void display();
		
}
