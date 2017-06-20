package relationshipdemo;
/*
 * IS-A relationship based on Inheritance, which can be of two types Class Inheritance or Interface Inheritance.
 * 
 * Has-a relationship is composition relationship which is a productive way of code reuse.
 * 
 * */
public class RelationshipDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Below you see that Person is a parent class
	    //and Employee is-A Person so it inherits the parent class Person
	    //so when you can have the below statement because Employee is-A Person
		Person p = new Employee(); //Employee is object of type person
		
		System.out.println("Showing IS-A relationship : "+p.name());
		
		System.out.println("Now showing Has-A relation Ship demo");
		Student stud = new Student();
		stud.showFavbook();
	}

}
