package mypackage;

public class LogicalAnd {

	public static void main(String[] args) {
		//Check if a student passed both theory and practical exams using logical AND.
    boolean theory  = true;
    boolean practical = false;
    if(theory && practical) {
    	System.out.println("Passed");
    }
    else {
    	System.out.println("Failed");
    }
	}

}
