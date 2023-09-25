//Thread synchronization
class Resource {
	synchronized public void use(String name)throws Exception {
		System.out.print("[");
		System.out.print(name);
		Thread.sleep(2000);
		System.out.print("]");
	}
}
class ResourceUtilizerThread extends Thread {
	Resource ob;
	String name;
	ResourceUtilizerThread(Resource ob, String name) {
		this.ob=ob;
		this.name=name;
		System.out.println(name+" started");
	}
	public void run() {
       try {	
    	   ob.use(name);       
       }catch(Exception e) {}
}
}
public class Test18 {
	public static void main(String[] args)throws Exception {
		Resource ob=new Resource();
		ResourceUtilizerThread t1=new ResourceUtilizerThread(ob,"first");
		ResourceUtilizerThread t2=new ResourceUtilizerThread(ob,"second");
		ResourceUtilizerThread t3=new ResourceUtilizerThread(ob,"third");
		t1.start();t2.start();t3.start();
		t1.join();t2.join();t3.join();
	}

	}


