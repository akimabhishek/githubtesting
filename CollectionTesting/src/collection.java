
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class collection {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
	
		Map<String,Integer> map = new HashMap<String,Integer>();;
		map.put("A",2);
		map.put("B",1);
		map.put("C",8);
		
		
		
		//List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(map.entrySet());

		/*Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});*/
		
		 List list = new LinkedList(map.entrySet());
	       // Defined Custom Comparator here
	       Collections.sort(list, new Comparator() {	            	            
				public int compare(Object o2,Object o1) {
	               return ((Comparable) ((Map.Entry) (o1)).getValue())
	                  .compareTo(((Map.Entry) (o2)).getValue());
	            }
	       });	

	      JSONArray arr = new JSONArray();
	      for(List<Entry<String, Integer>> entry : list)
	      {
	    	  JSONObject details = new JSONObject();
	    	  details.put(map1.getKey(),map1.getValue());
	    	  arr.add(details);
	      }
	      
	      System.out.println(arr);
	       
}
}
