package Collection_1;

import java.util.*;

public class hasshSet {

	public static void main(String[] args) {
		HashSet<String> S = new HashSet<String>();
		for(int i=0;i<4;i++)
		{
			S.add("A");
		}
		
		Iterator<String> it = S.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
