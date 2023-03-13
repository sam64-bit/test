//setting priority
class PriorityThread extends Thread {
	public void run() {
	System.out.println(Thread.currentThread()+" running");
	}
}

public class Test16 {
	public static void main(String[] args) {
		PriorityThread t1=new PriorityThread();
		PriorityThread t2=new PriorityThread();
		t1.setPriority(Thread.NORM_PRIORITY+2);
		t2.setPriority(8);
		System.out.println(Thread.currentThread()+" is running");
		t1.start();
		t2.start();

	}

}
