package com.log.regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindUserRegex {

	public static void Regex()
	{
		//String regex = ".*"+"NewArticlesController"+".*RequestMapping is "+"GETarticlesnew"+" The SM(.*)USER is (.*)";
		String regex = ".*"+"NewArticlesController"+".*"+" The SM(.*)USER is (.*)+"+".";
		Map<String,Integer> map = new HashMap<String,Integer>();
		Pattern p = Pattern.compile(regex);
		String s;
		
		 try
		 {
			 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\abhishek\\Desktop\\WebApplication.txt"));
			 
			 while((s=br.readLine())!=null)
			 {
				 Matcher m = p.matcher(s);
				 if(m.find())
				 {
					 String user = m.group(2);
					 
					 if(!map.containsKey(user))
					 {
						 map.put(user,1);
					 }
					 else
						 map.put(user,map.get(user)+1);
				 }
			 }
		 }catch(IOException exception)
		 {
			 System.out.println(exception);
		 }
		 System.out.println(map);
	}
	
	public static void main(String[] args) {
		
		Regex();

	}

}
