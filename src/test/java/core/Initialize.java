package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Initialize {
	protected static WebDriver driver = new HtmlUnitDriver();

	public Initialize(String URL) {
		driver.get(URL);
	}
	public Initialize() {
		
	}
}
