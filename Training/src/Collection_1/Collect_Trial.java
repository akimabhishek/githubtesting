package Collection_1;

public class Collect_Trial implements Comparable<Collect_Trial>{
	int enrol;String name;int age;
	Collect_Trial(int enrol,String name,int age)
	{
		this.enrol = enrol;
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Collect_Trial b) {  
	    if(enrol>b.enrol){  
	        return 1;  
	    }else if(enrol<b.enrol){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
}
}