import java.util.Scanner;

class Room {
	int height, width;
	Room() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height & width");
		height=sc.nextInt();
		width=sc.nextInt();
		System.out.println("assigned");
	}
	public void print() {
		System.out.println("height "+height);
		System.out.println("width "+width);
	}
	public void costCalculation() {
		int unitprice=15;
		int totalcost=unitprice*height*width;
	System.out.print("cost to paint"+totalcost);
	}
}
public class Test3 {
	public static void main(String[] args) {
        Room lfl1=new Room();
        Room lfl2=new Room();
        Room lfl3=new Room();
        System.out.println("h and w of lfl1:");
        lfl1.print();
        System.out.println("h and w of lfl2:");
        lfl2.print();
        System.out.println("h and w of lfl3:");
        lfl3.print();
        System.out.println("painting of lfl1:");
        lfl1.costCalculation();
        System.out.println("painting of lfl2:");
        lfl2.costCalculation();
        System.out.println("painting of lfl3:");
        lfl3.costCalculation();
	}

}