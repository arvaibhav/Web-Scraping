import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;

public class topColleges {

	public static void main(String args[])
	{
		try {
			Document doc = Jsoup.connect("http://www.4icu.org/top-universities-world/").userAgent("Mozilla/56.0").get();
			Elements elem = doc.select("a.lead");
			int i=0;
			for(Element list:elem)
			{
				if(i<100)
				{
					i++;
					System.out.println(i+" "+list.getElementsByTag("a").first().text());
				}
				else break;
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
