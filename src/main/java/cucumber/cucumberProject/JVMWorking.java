package cucumber.cucumberProject;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JVMWorking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		//Getting hold of class object created by JVM
		Class c1= s1.getClass();
		 
		//Printing type of object using c1
		System.out.println("Class Name:"+c1.getName());
		
		//Getting all Methods in array and printing them
		Method m1[]=c1.getDeclaredMethods();
		for(Method method:m1) {
			System.out.println("Methods:"+method.getName());
		}
		
		//Getting all fields in array and printing them
		Field f1[]=c1.getDeclaredFields();
		for(Field field:f1) {
			System.out.println("Field:"+field.getName());
		}		
	}
}
