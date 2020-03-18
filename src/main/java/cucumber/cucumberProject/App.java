package cucumber.cucumberProject;

import cucumber.cucumberProject.test.FirstProgramTest;

/**
 * Hello world!
 *
 */
public class App 
{	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        FirstProgramTest firstProgram = new FirstProgramTest();
        
        firstProgram.testMethod();
        
    }
   
}
