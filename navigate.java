package myJSOUP;
// https://jsoup.org/cookbook/extracting-data/selector-syntax
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class navigate {

	public static void main(String[] args) throws Exception {
		 Document doc = Jsoup.connect("https://www.pearsonschool.com").get();
		 Elements links = doc.select("a[href]"); // a with href
		 Elements pngs = doc.select("img[src$=.png]");
		   // img with src ending .png

		 Element masthead = doc.select("div.masthead").first();
		   // div with class=masthead

		 Elements resultLinks = doc.select("h1.r > a"); // direct a after h1

		 
		 for (Element s : links) {
			 System.out.println(s.text());
		
		 }
	}

}
