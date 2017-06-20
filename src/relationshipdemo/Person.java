package relationshipdemo;
/*
 * IS-A relationship is implemented via Inheritance 
 * 
 * HAS-A relationship mean the use of instance variables that are references to other objects
 * */
public class Person {
	
	public String name() {
		return "name";
	}
	
	public void favBook(String book){
		System.out.println("My Favorite Color is : "+book);
	}

}
