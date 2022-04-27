

public class Triangle {
	private int sideOne;
	private int sideTwo;
	private int sideThree;
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSideOne() {
		return sideOne;
	}
	public void setSideOne(int sideOne) {
		this.sideOne = sideOne;
	}
	public int getSideTwo() {
		return sideTwo;
	}
	public void setSideTwo(int sideTwo) {
		this.sideTwo = sideTwo;
	}
	public int getSideThree() {
		return sideThree;
	}
	public void setSideThree(int sideThree) {
		this.sideThree = sideThree;
	}
	public int computePerimeter(int sideOne)
    {
        return 3*sideOne;
    }
	public int computePerimeter(int sideOne,int sideTwo)
    {
        return (2*sideOne)+sideTwo;
    }
	public int computePerimeter(int sideOne,int sideTwo,int sideThree)
    {
        return sideOne+sideTwo+sideThree;
    }
		
}
