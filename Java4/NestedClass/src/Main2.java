//we don't need to instantiate an outer class object to access the inner class in case of static inner class
public class Main2 {

	public static void main(String[] args) {
		OuterClassAndStaticInnerClass.StaticInnerClass innerClass = new OuterClassAndStaticInnerClass.StaticInnerClass();
		innerClass.showX();
		}

	

}
