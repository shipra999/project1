package new_selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium_new {
	public static void main(String args[]){
	WebDriver driver;
	System.setProperty("webdriver.gecko.driver", "E:\\geckodriver\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://opensource-demo.orangehrmlive.com");
	String title=driver.getTitle();
	System.out.println(title);
	
}
}
