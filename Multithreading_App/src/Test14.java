//how to generate random integer number
import java.util.Random;
class Number {
	int n;
	boolean valuegenerated=false;
	synchronized void getSquare() {
		System.out.println("square is :"+n*n);
	}
	synchronized void getCube() {
		System.out.println("cube is :"+n*n*n);
	}
}
class consumer1 extends Thread {
	Number number;
	consumer1(Number number) {
		this.number=number;
	}
	public void run() {
		while(true) {
			try {
			if(number.valuegenerated==false)wait();
			if(number.n%2==0) {
			number.getSquare();
			number.valuegenerated=false;
			notify();
			}}
			catch(Exception e) {}
		}
	}
}
class consumer2 extends Thread {
	Number number;
	consumer2(Number number) {
		this.number=number;
	}
	public void run() {
		while(true) {
			try {
			if(number.valuegenerated==false)wait();
			if(number.n%2!=0) {
			number.getCube();
			number.valuegenerated=false;
			notify();
			}}
			catch(Exception e) {}
		}
	}
}


class Producer extends Thread {
	Number number;
	Producer(Number number) {
		this.number=number;
	}
	public void run() {
		Random r=new Random();
		while(true) {
			try {
			if(number.valuegenerated==true)wait();
			number.n=r.nextInt()%10;
			System.out.println("random integer generated is "+number.n);
			number.valuegenerated=true;
			notify();	
			
	}catch(Exception e) {}
	}}
}


public class Test14 {

	public static void main(String[] args) {
		Number number = new Number();
		Producer t1=new Producer(number);
		consumer1 c1=new consumer1(number);
		consumer2 c2=new consumer2(number);
		t1.start();
		c1.start();
		c2.start();

	}

}
