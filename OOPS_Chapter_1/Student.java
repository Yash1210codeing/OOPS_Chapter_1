package OOPS_Chapter_1;
public class Student {
   //String name="Kaju";  //Class ka data/variables
   //int age=20;  // class ka data / variables
	String name;
	int age;
    public void Intro_youself() {  // Class Ka Method Ya Function
	System.out.println("My Name is "+ name +" and age is "+age);
    }
    public void sayhey(String name) {
    	System.out.println(name+" Say Hey "+this.name);
    }
    public static void fun() {
    	//System.out.println(count);
    	System.out.println("I am in Fun");
    }
    static {
    	System.out.println("Hey All Welcome to Codeing Blocks");
    }
    static {
    	System.out.println(" Baklol Tinder use nahi Karna hai ");
    }
 }
