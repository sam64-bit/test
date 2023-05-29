import java.util.Scanner;

//abstract class (Relationship between two classes)
//is loose
abstract class Shape {
	abstract void area();
}
class circle extends Shape {
	private double radious=5.7;
	public void area() {
  System.out.println("Circle area :"+3.14*radious*radious);
	}
}
class Triangle extends Shape {
	private double base=9.5, height=6.9;
	public void area() {
System.out.println("Triangle area :"+0.5*base*height);
	}
}
public class Test6 {
	public static void main(String[] args) {
     int ch;
     Shape s;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter choice 1/2 ");
     ch=sc.nextInt();
     if(ch==1) {
    	 s=new circle();
    	 s.area();
     }else {
    	 s=new Triangle();
    	 s.area();
     }
	}

}
