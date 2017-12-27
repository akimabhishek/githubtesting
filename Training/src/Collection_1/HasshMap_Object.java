package Collection_1;
import java.util.*;

class Book 
{
	int id;
	String name;
	String text;
	
	Book(int id,String name, String text)
	{
		this.id = id;
		this.name = name;
		this.text = text;
	}		
}

public class HasshMap_Object {

	public static void main(String[] args) {
		HashMap<Integer,Book> m = new HashMap<Integer,Book>();
		Book b1 = new Book(1,"Abhi","XYZ");
		Book b2 = new Book(2,"Abhishek","XYZ");
		m.put(1,b1);
		m.put(2,b2);
		
		for(Map.Entry<Integer,Book> o : m.entrySet())
		{	
			Book b = o.getValue();
			
			System.out.println(b.id+b.name+b.text);
			System.out.println();
		}
	}

}
