package com.download.url;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class DownloadURL {

	public static void saveFile(URL url, String file) throws IOException {
	    System.out.println("opening connection");
	    InputStream in = url.openStream();
	    FileOutputStream fos = new FileOutputStream(new File(file));

	    System.out.println("reading file...");
	    int length = -1;
	    byte[] buffer = new byte[1024];// buffer for portion of data from
	    // connection
	    while ((length = in.read(buffer)) > -1) {
	        fos.write(buffer, 0, length);
	    }


	    fos.close();
	    in.close();
	    System.out.println("file was downloaded");
	}

	public static void main(String args[])
	{
	    try
	    {
	         URL url = new URL("https://www.ibm.com/support/knowledgecenter/SVU13_7.2.1/com.ibm.ismsaas.doc/reference/AssetsImportCompleteSample.csv?view=kc");
	         String fileName = "C:\\Users\\abhishek\\Desktop\\information.csv";
	         saveFile(url,fileName);
	    }
	    catch(IOException e)
	    {
	        e.printStackTrace();
	    }
	}
}