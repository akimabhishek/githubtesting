package Collection_1;
import java.util.*;

public class Map_Trial {

	public static void main(String[] args) {
		Map_Trial_Trial obj = new Map_Trial_Trial();
		Map <String,Integer> m = new HashMap <String,Integer>();
		obj.adding("Abhi",1010,m);
		obj.adding("Kjk",10102,m);
		
		Display obj1 = new Display();
	    obj1.Display_Elements(m);

	}

}
