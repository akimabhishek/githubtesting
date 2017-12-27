package Preparation_1;

public class Trimming {

	static void methodA()
	{
		try {
			System.out.println("This will be executed");
			throw new RuntimeException("Trial");
		}
		finally
		{
			System.out.println("This is certain for A");
		}
	}
	
	static void methodB()
	{
		try {
			System.out.println("Checking for B");
			return;
		}
		finally{
			System.out.println("This is certain for B");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			methodA();
		}catch(Exception e){
			System.out.println("Method A is called");
		}
		methodB();
		methodC();

	}

}
