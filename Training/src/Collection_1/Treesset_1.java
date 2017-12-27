package Collection_1;

public class Treesset_1 implements Comparable<Treesset_1>	 {
	int id;
	String name;
	String book;
	
	
	Treesset_1(int id,String name, String book)
	{
		this.id = id;
		this.name = name;
		this.book = book;
	}
	
	public int compareTo(Treesset_1 t)
	{
		if(id>t.id)
			return 1;
		else if(id<t.id)
			return -1;
		else
			return 0;
	}
	
}
