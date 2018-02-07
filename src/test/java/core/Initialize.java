package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Initialize {
	protected static WebDriver driver = new InternetExplorerDriver();

	public Initialize(String URL) {
		driver.get(URL);
	}
	public Initialize() {
		
	}
}
