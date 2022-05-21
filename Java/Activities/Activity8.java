package Activities;

public class Activity8 {

	public static void main(String[] args) {
		try {
			Activity8.exceptionTest("Will print to console");
			Activity8.exceptionTest(null);
			Activity8.exceptionTest("won't execute");
		} catch (customException e) {
			System.out.println("Inside Catch Block : "+ e.getMessage());
		}
        
       
	}
	static void exceptionTest(String str) throws customException
    {
 	   if(str == null)
 	   {
 		   throw new customException("String value in null");
 	   }
 	   else
 	   {
 		   System.out.println(str);
 	   }
    }

}

class customException extends Exception
{
	private String message;

	public customException(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public String getMessage() {
	    return message;
	}
}
