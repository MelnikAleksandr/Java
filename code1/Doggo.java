public class Doggo {
	int doggoAge;
	
	public Doggo(String name) {
		// This constructor has one parameter, name.
		System.out.println("Name chosen is :" + name );
  }
  
	public void setAge( int age ) {
		doggoAge = age;
  }
  
	public int getAge( ) {
		System.out.println("Doggo's age is :" + doggoAge );
		return doggoAge;
  }
  
	public static void main(String []a) {
		/* Object creation */
		Doggo myDoggo = new Doggo( "David" );
		
		/* Call class method to set dogoo's age */
		myDoggo.setAge(200);
		
		/* Call another class method to get doggo's age */
		myDoggo.getAge( );
		
		/* You can access instance variable as follows as well */
		System.out.println("Variable Value :" + myDoggo.doggoAge );
	}
} 
