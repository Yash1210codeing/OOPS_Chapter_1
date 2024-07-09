package OOPS_Chapter_1;
//import java.util.Scanner;
import java.util.ArrayList;
public class StudentClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Scanner sc=new Scanner(System.in);
		//ArrayList<Integer>ll=new ArrayList<>();
		//ll.add(10);
		//ArrayList<Integer>ll1=new ArrayList<>();
		//ll1.add(5);
		System.out.println("Hey Bhai Log");
        Student s=new Student();
        s.name="Yash";
        s.age=20;
        s.Intro_youself();
        Student s1=new Student();
        s1.name="Raj";
        s1.age=25;
        s1.Intro_youself();
        s1.sayhey("Sharma");
        s.sayhey("Sharma");
        Student.fun();
        s.fun();
        s1.fun();       
	}
	static {
		System.out.println(" Yash Welcome to Tinder");
	}
}
