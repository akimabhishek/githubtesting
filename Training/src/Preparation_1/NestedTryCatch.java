package Preparation_1;

public class NestedTryCatch {

	public static void main(String[] args) {
		
		try 
		{
			try{
				int a = 3/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Check1"+e);
			}
			
			try
			{
				int a[] = new int[5];
				a[45] = 0;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Check2"+e);
			}
			}
		catch(Exception e)
		{
		System.out.println("Check3");
		}
		

	}

}
