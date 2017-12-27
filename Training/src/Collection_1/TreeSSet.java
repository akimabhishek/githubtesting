package Collection_1;
import java.util.*;


public class TreeSSet {

	public static void main(String[] args) {
		Set<Treesset_1> s = new TreeSet<Treesset_1>();
		Treesset_1 tr1 = new Treesset_1(1,"Abhi","XYZ");
		Treesset_1 tr2 = new Treesset_1(2,"Abhishek","ABC");
		
		s.add(tr1);
		s.add(tr2);
		
		for(Treesset_1 o : s)
		{
			System.out.println(o.id+o.name+o.book);
		}
	
	}

}
