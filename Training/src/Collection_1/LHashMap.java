//package Collection_1;
//
//public class LHashMap {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

package Collection_1;
import java.util.*;

class features
{
	String name, code, tax_code;
	int N;
	public features(String name, String code, String tax_code)
	{
		this.name = name;
		this.code = code;
		this.tax_code = tax_code;
	}
}

public class LHashMap {
			
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,features> M = new LinkedHashMap<Integer,features>();
		features b1 = new features("Abhi","XcD","Austin");
		features b2 = new features("Kumar","YCD","Utah");
		
		M.put(1, b1);
		M.put(2, b2);
		
		for (Map.Entry<Integer,features> entry : M.entrySet())
		{
			System.out.println("Key ="+entry.getKey()+"Value = "+entry.getValue().name );
		}
	}

}
