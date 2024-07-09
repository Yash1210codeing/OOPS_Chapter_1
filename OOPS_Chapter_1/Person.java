package OOPS_Chapter_1;
public class Person {
	String name="Anish";
	int age=20;
	public void Intro_youself() {
		System.out.println("My Name is "+name+" and age is "+age);
	}
	public Person() {		
	}
	//public Person(int age) {		
	//}
	public Person (int age,String name) {	
	this.age=age;
	this.name=name;
	}
	//public Person (int age,String name,int x) {
	//}
	
}
