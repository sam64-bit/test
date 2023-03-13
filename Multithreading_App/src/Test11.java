//create a single thread by Extending Thread
class mythread extends Thread {
	String name;
	mythread(String name) {
		this.name=name;
		System.out.println(name+" thread created");
	}
	public void run() {
		try {
		System.out.println(name+" is printing welcome");
		Thread.sleep(2000);
		System.out.println(name+" is printing presidency");
		}catch(Exception e) {}
	}
}
public class Test11 {
	public static void main(String[] args) throws Exception {
	   System.out.println("hi");	
       mythread ob1=new mythread("first");
       ob1.start();
       mythread ob2=new mythread("second");
       ob2.start();
       mythread ob3=new mythread("third");
       ob3.start();
       Thread.sleep(10000);
       System.out.println("bye");
       
	}

}
