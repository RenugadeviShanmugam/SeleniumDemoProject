package demogithub;

public class DemoJava {
	
	static int a=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world");
		System.out.println("value of a: "+a);
		
		Car obj = new Car();
		obj.methodA();
		System.out.println(Car.name);
			
		}

}

class Car{
	
	static String name = "anjali";
	
	public void methodA() {
		
		System.out.println("Inside methodA");
	}
}


