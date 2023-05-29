import java.util.Scanner;

interface GeoShape {
	public void setRadious(double rad);
	public void area();
	public void volume();
}
class Rectangle implements GeoShape {
	private double len,breadth;
	public void setRadious(double rad) {
		len=breadth=rad;
	}
	public void area() {
System.out.println("square area "+len*breadth);
	}
	public void volume() { }
}
class Cube implements GeoShape {
	private double side;
	public void setRadious(double rad) {
		side=rad;
	}
	public void area() {}
	public void volume() {
System.out.print("Cube volume "+side*side*side);		
	}
}
public class Test7 {
	public static void main(String[] args) {
		GeoShape g;
		int dimension;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2-D or 3-D");
		dimension=sc.nextInt();
		if(dimension ==2) {
			g=new Rectangle();
			g.setRadious(3.5);
			g.area();
		}else {
			g=new Cube();
			g.setRadious(2.2);
			g.volume();
		}

	}

}
