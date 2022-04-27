public class Shape {

        

	public static class Rectangle {
		
		private double value1;
		private double value2;
		private double area;


		public void setValue1(double l) {
			this.value1=l;
		}
		
		public void setValue2(double w) {
			this.value2=w;
		}
		
		public Double computeRectangleArea() {
			area=value1*value2;
			return area;
			
		}
	}
	
	public static class Triangle {
		
		private double area, value1, value2;
		
		public void setvalue1(double b) {
			this.value1=b;
		}
		
		public void setvalue2(double h) {
			this.value2=h;
		}

		public Double computeTriangleArea() {
			area=(0.5)*value1*value2;
			return area;
			
		}
	}	
}