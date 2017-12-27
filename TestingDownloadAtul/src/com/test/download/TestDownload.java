package com.test.download;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class TestDownload {

	public static void main(String[] args) throws IOException {
		
		//URL website = new URL("https://www.ibm.com/support/knowledgecenter/SVU13_7.2.1/com.ibm.ismsaas.doc/reference/AssetsImportCompleteSample.csv?view=kc");
		URL website = new URL("https://drive.google.com/file/d/1AFMXuSLOzkoqtalDvetzSnRBW-h68FeP/view?usp=sharing");
		ReadableByteChannel rbc = Channels.newChannel(website.openStream());
		  @SuppressWarnings("resource")
		FileOutputStream fos = new FileOutputStream("D:\\information");
		  fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		  System.out.println("hi");

	}

}
