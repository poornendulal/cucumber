package core;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.Scenario;

public class TC01 {
	public static void main(String[] args) {

		//System.setProperty("webdriver.ie.driver",
		//		"C:\\Users\\IBM_ADMIN\\eclipse-workspace\\cucumber\\cucumber\\drivers\\IEDriverServer.exe");
		char operation[] = { 'i', 'b' ,'v'};
		String control[] = { "lst-ib", "btnK","resultStats" };
		String testdata[] = { "cucumber","seconds" };
		Initialize init = new Initialize("http://www.google.com");

		Automation automate = new Automation();
		automate.run(Initialize.driver, operation, control, testdata);
		Initialize.driver.quit();

	}
	public void openwebpage()
	{
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\IBM_ADMIN\\eclipse-workspace\\cucumber\\cucumber\\drivers\\IEDriverServer.exe");
		Initialize init = new Initialize("http://www.google.com");
		
		
	}
	public void entersearch()
	{
		char operation[] = { 'i',};
		String control[] = { "lst-ib"};
		String testdata[] = { "cucumber"};
		Initialize init = new Initialize();
		Automation automate = new Automation();
		automate.run(Initialize.driver, operation, control, testdata);
	}
	public void clickbutton()
	{
		char operation[] = { 'b' };
		String control[] = { "btnK" };
		String testdata[] = {  };
		Initialize init = new Initialize();
		Automation automate = new Automation();
		automate.run(Initialize.driver, operation, control, testdata);
	}
	public void verify()
	{
		char operation[] = { 'v'};
		String control[] = { "resultStats" };
		String testdata[] = { "seconds" };
		Initialize init = new Initialize();
		Automation automate = new Automation();
		automate.run(Initialize.driver, operation, control, testdata);
	}
}
