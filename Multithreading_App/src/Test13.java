class FactThread extends Thread {
String name;
int n;
long fact=1;
FactThread(String name, int n) {
	this.name=name;
	this.n=n;
	System.out.println(name+" started");
}
public void run() {
try {
for(int i=1;i<=n;i++) {
	System.out.println(name+" is running");
	fact=fact*i;
	Thread.sleep(5000);
}
}catch(Exception e) {}
System.out.println(name+" "+fact);
}
}

public class Test13 {
	public static void main(String[] args) throws Exception{
		FactThread t1=new FactThread("one",5);
		FactThread t2= new FactThread("two",6);
		FactThread t3=new FactThread("three",7);
		t1.start();t2.start();t3.start();
      System.out.println("status of child threads:");
      System.out.println("one :"+t1.isAlive());
      System.out.println("second :"+t2.isAlive());
      System.out.println("three :"+t3.isAlive());
      t1.join();
      t2.join();
      t3.join();
      System.out.println("status of child threads:");
      System.out.println("one :"+t1.isAlive());
      System.out.println("second :"+t2.isAlive());
      System.out.println("three :"+t3.isAlive());
      System.out.println("bye");

	}

}













