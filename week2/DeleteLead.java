package assignment1.week2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByLinkText("Email").click();
		driver.findElementByName("emailAddress").sendKeys("jra@test.com");
		WebElement Findleads = driver.findElementByXPath("//button[text()='Find Leads']");
		Findleads.click();
		Thread.sleep(3000);
		String LeadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		WebElement FirstResult = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
	    FirstResult.click();
	    driver.findElementByLinkText("Löschen").click();
	    Thread.sleep(3000);
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(LeadID);
		driver.findElementByLinkText("Find Leads").click();
	    Thread.sleep(3000);
	    boolean DisplayText = driver.findElementByClassName("x-paging-info").isDisplayed();
	    if(DisplayText== true)
			System.out.println("No records to display");
		else
			System.out.println("There are some records exist");
		


	}

}
