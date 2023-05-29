import java.util.Random;

//producer thread generates a random number , consumer threads
//to print square and cube of random numbers
class BlockingQueue {
	int number;
	boolean isgenerated=false;
	synchronized void put(int n) {
		number=n;
	}
	synchronized void getSquare() {
		System.out.println("square is "+number*number);
	}
	synchronized void getCube() {
		System.out.println("cube is "+number*number*number);
	}
}
class producerr extends Thread {
	BlockingQueue Q;
	producerr(BlockingQueue Q) {
		this.Q=Q;
	}
	public void run() {
		while(true) {
		try {
	if(Q.isgenerated==true)wait(); 	
	Random r=new Random();
    int n=r.nextInt()%10;
    System.out.println("producer number generated "+n);
    Q.put(n);
    Q.isgenerated=true;
    notify();   
		}catch(Exception e) {}
	}
	}
}
class consumerr1 extends Thread {
	BlockingQueue Q;
	consumerr1(BlockingQueue Q) {
		this.Q=Q;
	}
	public void run() {
		while(true) {
		try {
		if(Q.isgenerated==false)wait();
		if(Q.number%2==0) {Q.getSquare();
		Q.isgenerated=false;
		notify();
		}
		}catch(Exception e) {}
	}
}
}
class consumerr2 extends Thread {
	BlockingQueue Q;
	consumerr2(BlockingQueue Q) {
		this.Q=Q;
	}
	public void run() {
		while(true) {
		try {
		if(Q.isgenerated==false)wait();
		if(Q.number%2!=0) {Q.getCube();
		Q.isgenerated=false;
		notify();
		}
		}catch(Exception e) {}
	}
	}
	}
public class Test15 {
	public static void main(String[] args) throws Exception{
    BlockingQueue Q=new BlockingQueue();
    producerr p=new producerr(Q);
    consumerr1 c1=new consumerr1(Q);
    consumerr2 c2=new consumerr2(Q);
    p.start();c1.start();c2.start();
    p.join();c1.join();c2.join();
    
	}

}








