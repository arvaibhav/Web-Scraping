
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;

public class topMovies {

	public static void main(String args[])
	{
		try {
			Document doc = Jsoup.connect("http://www.imdb.com/list/ls055386972/").userAgent("Mozilla/56.0").get();
			Elements elem = doc.select("div.info");
			int i=0;
			for(Element list:elem)
			{
				i++;
				System.out.println(i+" "+list.getElementsByTag("a").first().text());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
