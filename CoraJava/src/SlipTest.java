import java.util.Scanner;
// create an array, fetch all elements , display to user
// a[1,2,3,4,5]  0 to 5  exception 
//slip test 
//students scored (20211CSE0152-Lahari,20211CSE0129-Preethi,
//20211CSE-165-adil,173-faiz,131-durgaprasad,
//0059-rachana)
public class SlipTest {
	public static void main(String[] args) {
     int[] x = {10,20,30,40,50};     
     System.out.println("Printing elements");
     try {
    	 for(int i=0;i<10;i++) {
         System.out.println(x[i]);
    	 }
     }catch(Exception e) {
    	 System.out.print("Exceeding range");
     }}}





