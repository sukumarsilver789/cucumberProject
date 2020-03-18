package polymorphism;

public class PolymorphismDemo {

	public static void main(String [] args) {
		
		//object instantiation
		Sum sum = new Sum();
		InheritenceDemo inheritDemo = new InheritenceDemo();
		
		//Polymorphism
		int sum1 = sum.sum(5, 6);
		int sum2 = sum.sum(5, 6, 6);
		System.out.println("Sum1:"+sum1+", Sum2:"+sum2);
		
		//inheritence
		
		System.out.println("Inheritence Sum:"+inheritDemo.sum(9, 10));
	}
}
