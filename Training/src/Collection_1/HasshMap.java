package Collection_1;
import java.util.*;

public class HasshMap {

	public static void main(String[] args) {
		
		int arr[] = {1,3,4,5,8};
		
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		int i = arr.length;
		System.out.println(i);
		int j =0 ;
		while(j<i)
		{
			
			m.put(j, arr[j]);
			j++;
//			if(m.get(j)==null)
//			{
//				
//			}
		}
		
		for(Map.Entry  M : m.entrySet())
		{
			System.out.println("M.getKey()"+M.getKey());
		}
	}

}
