//abstraction- specifies what to do but not how to do
//-abstract class- has both abstract and concrete methods(not mandatory)
//abstract method- no code inside
public abstract class Area {
	float area;
	public abstract void computeArea();
	public void showArea() {
		System.out.println("Area: "+area);
	}

}
