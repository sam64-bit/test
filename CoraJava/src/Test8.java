import java.util.Scanner;
//unchecked exception demo
public class Test8 {
	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x and y");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Addition is "+(x+y));
		System.out.println("subtraction is"+(x-y));
		try {
			System.out.println("Division is "+x/y);
		}catch(Exception e) {
			System.out.println("Division by zero");
		}
		System.out.println("Multiplication is "+x*y);

	}

}
