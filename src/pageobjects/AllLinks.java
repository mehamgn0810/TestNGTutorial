package pageobjects;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllLinks {

	public static List<WebElement> clickableLinkElements(WebDriver driver) {
		List<WebElement> linksClickable = new ArrayList<WebElement>();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		elements.addAll(driver.findElements(By.tagName("img")));

		for (WebElement e : elements) {
			if (e.getAttribute("href") != null) {
				linksClickable.add(e);
			}
		}
		return linksClickable;
	}
	
	public static String linkStatus(URL url) {
		
		try {
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			String responseMessage = conn.getResponseMessage();
			conn.disconnect();
			return responseMessage;
		}
		catch(Exception e){
			return e.getMessage();
		}
	}

}