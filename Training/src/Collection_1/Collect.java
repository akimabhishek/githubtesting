package Collection_1;
import java.util.*;

public class Collect {

	public static void main(String[] args) {
		//Collect obj = new Collect();
		  TreeSet<Collect_Trial> al=new TreeSet<Collect_Trial>();  
//		  Collect_Trial c1 = new Collect_Trial(1,"Abhi",10);
//		  Collect_Trial c2 = new Collect_Trial(2,"sdfjkh",2);
//		  Collect_Trial c3 = new Collect_Trial(3,"fkjhsdkjfh",3);
//		  
//		  al.add(c1);
//		  al.add(c2);
//		  al.add(c3);
		  
		  al.add(new Collect_Trial(1,"Abhi",10));
		  al.add(new Collect_Trial(2,"sdfjkh",2));
		  al.add(new Collect_Trial(3,"fkjhsdkjfh",3));
		  
		  for(Collect_Trial b:al)
		  {
			  System.out.println("enrol: "+b.enrol+"name: "+b.name+"age: "+b.age);
		  }
	}

}
