
public class CurrentAccount implements MaintainanceCharge{
	
	float mCharge=100, mAmount;

	public Float calculateMaintanceCharge(Float noOfYears) {
		mAmount=mCharge*noOfYears+200;
		return mAmount;
	}
	
}
