public class Rectangle {
    		
	private int length;
	private int width;
	private int area;
	private int newlen;
	private int newwid;
	private int newarea;
	
	public Rectangle(int l, int w) {
		this.length=l;
		this.width=w;
	}
	
	public int area() {		
		area=length*width;
		return area;
	}
	
	public void display(){
		System.out.println("Rectangle Dimension");
		System.out.println("Length:"+length);
		System.out.println("Width:"+width);
	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	Rectangle dimensionChange(int newDimension){
		newlen=length*newDimension;
		newwid=width*newDimension;
		newarea=newlen*newwid;
		return new Rectangle(newlen,newwid);
		
		
	}
	

}
