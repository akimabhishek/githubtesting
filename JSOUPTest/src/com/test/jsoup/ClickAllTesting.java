package com.test.jsoup;

import java.io.IOException;
import java.util.HashSet;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ClickAllTesting {

    private static HashSet<String> links;
    
    public ClickAllTesting()
    {
        links = new HashSet<String>();
    }
    
    public static void getLinks(String url) {
    
        if(!links.contains(url))
        {
            try 
            {
                if(links.add(url))
                {
                    System.out.println(url);
                }
                
                Document document = Jsoup.connect(url).get();
                Elements linksOnPage = document.select("a[href]");
                
                for(Element page : linksOnPage){
                    getLinks(page.attr("abs:href"));
                }
            }
            catch(IOException e)
            {
                System.err.println("For "+url+": "+e.getMessage());;
            }
        }       
    }
    
    
    public static void main(String[] args) {
        
        
        new ClickAllTesting();
        ClickAllTesting.getLinks("http://79.127.127.112");

    }

}