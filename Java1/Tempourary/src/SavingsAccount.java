
public class SavingsAccount implements MaintainanceCharge {

	float mCharge=50, mAmount;
	
	public Float calculateMaintanceCharge(Float noOfYears) {
		mAmount=2*mCharge*noOfYears+50;
		return mAmount;
	}
	
}
