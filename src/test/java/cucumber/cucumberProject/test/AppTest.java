package cucumber.cucumberProject.test;


/**
 * Hello world!
 *
 */
public class AppTest 
{	
	public static void test() {
		System.out.println( "Hello World! Static" );
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        FirstProgramTest firstProgramTest = new FirstProgramTest();
        
        firstProgramTest.testMethod();
        
    }
   
}
