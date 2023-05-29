//Create a class student add members(id,name,cgpa)
//display for 3 student objects
class Student {
	String id;
	String name;
	double cgpa;
	public Student() {
	}
	public Student(String id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}	
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}	
}
public class Test4 {
	public static void main(String[] args) {
		Student Btechst=new Student("111","sunil",7.5);
		Student Bcast=new Student("112","sameer",7.6);
		Student Mbast=new Student("113","irfan",7.7);
		System.out.println(Btechst.toString());
		System.out.println(Bcast.toString());
		System.out.println(Mbast);
	}

}
