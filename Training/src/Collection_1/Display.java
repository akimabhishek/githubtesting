package Collection_1;
import java.util.*;

public class Display {
	public void Display_Elements(Map <String, Integer> M)
	{
		for(Map.Entry<String,Integer> entry : M.entrySet())
		{
			System.out.println("Key =" + entry.getKey()+" Value = "+ entry.getValue());
		}
	}
}
