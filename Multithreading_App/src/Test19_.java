//create three threads using Runnable to print 
//welcome
//presidency
//university
//respectively 
//improvise with common Task and run
//hint -  parameter passing to Task
class Task implements Runnable {
	String text;
	Task(String p) {
		text=p;
	}
	public void run() {
		System.out.println(Thread.currentThread());
		try {
			System.out.println(text);
			Thread.sleep(5000);
		}catch(Exception e) {}
	}
}
public class Test19_ {
	public static void main(String[] args) throws Exception{
		System.out.println(Thread.currentThread());
		System.out.println("hi");
       Task task = new Task("welcome");
       Thread t1=new Thread(task);
       t1.setName("first thread");
       task=new Task("presidency");
       Thread t2=new Thread(task);
       t2.setName("second thread");
       task=new Task("university");
       Thread t3=new Thread(task);
       t3.setName(" thread");
       t1.start();t2.start();t3.start();
       Thread.sleep(5000);
       System.out.println("bye");
	}

}