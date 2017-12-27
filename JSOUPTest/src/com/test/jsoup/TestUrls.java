package com.test.jsoup;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TestUrls {
	
	static void getLinks(String url, Set<String> urls) {

	    if (urls.contains(url)) {
	        return;
	    }
	    urls.add(url);

	    try {
	        Document doc = Jsoup.connect(url).get();
	        Elements elements = doc.select("a");
	        for(Element element : elements){
	            System.out.println(element.absUrl("href"));
	            getLinks(element.absUrl("href"), urls);
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	
	public static void main(String[] args) {
	
		Set<String> links = new HashSet<>();
		getLinks("https://79.127.127.112", links);

}
}
