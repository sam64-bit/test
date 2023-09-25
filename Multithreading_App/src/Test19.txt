class Task implements Runnable {
	public void run() {
		System.out.println("welcome");
	}
}
public class Test19 {
	public static void main(String[] args) throws Exception{
		System.out.println("hi");
       Task task = new Task();
       Thread t1=new Thread(task);
       t1.setName("first thread");
       t1.start();
       Thread.sleep(5000);
       System.out.println("bye");
	}

}
