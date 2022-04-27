public class Manager extends Employee {
	int teamSize;
    Manager(){
		id=2;
		name="Max";
		salary=40000;
	}
	public void computeHra() {
		hra = salary*0.4f;
	}
	public void showDetails() {
		super.showDetails();
		System.out.println(teamSize);
	}
}
