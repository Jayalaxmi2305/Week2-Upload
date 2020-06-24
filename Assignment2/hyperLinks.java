package week2.Assignment2;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hyperLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Go to Home Page").click();
		driver.navigate().back();
		Thread.sleep(3000);
		//Find where  am supposed to go without clicking me
		String Link = driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
	    System.out.println(Link);
	    // Verify am I broken
	     boolean TextVerify = driver.findElementByLinkText("Verify am I broken?").isDisplayed();
	    if(TextVerify==false)
	    {
	    	System.out.println("Link is broken");
	    }
	    System.out.println("Link is not broken");
	    //Go to Home Page
	    driver.findElementByLinkText("Go to Home Page").click();
	   
		//How many links are available in this page?
	   List<WebElement> link = driver.findElementsByTagName("a");
	    System.out.println(link.size());
	   

}
}
