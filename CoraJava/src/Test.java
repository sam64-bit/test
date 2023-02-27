class Circle {
	private int x=2,y=3;
	private double radious=3.5;
	public void circumference() {
		System.out.println("Circumference is "+2*3.141*radious);
	}
	public void area() {
		System.out.println("Area is "+3.141*radious*radious);
	}
	public void printCenter() {
		System.out.println("Center coordinate is ("+x+","+y+")");
	}
}
public class Test {
	public static void main(String[] args) {
		Circle acircle=new Circle();
		Circle bcircle=new Circle();
		acircle.circumference();
		bcircle.area();
        acircle.printCenter();
	}

}
