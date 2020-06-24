package assignment1.week2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
	driver.findElementByXPath("(//input[@Name='companyName'])[2]").sendKeys("Testleaf");
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(3000);
	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	 WebElement CompanyName = driver.findElementById("viewLead_companyName_sp");
	 String CompanyNameText = CompanyName.getText();
	System.out.println("Old Company Name: "+CompanyNameText);
	driver.findElementByLinkText("Bearbeiten").click();
	String newText = CompanyNameText.replace(CompanyNameText, "Selenium");
	driver.findElementById("updateLeadForm_companyName").clear();
	driver.findElementById("updateLeadForm_companyName").sendKeys(newText);
	driver.findElementByXPath("//input[@value='Aktualisierung']").click();
	String UpdatedName = driver.findElementById("viewLead_companyName_sp").getText();
	if(UpdatedName.startsWith(newText));
	 {
		System.out.println("Entered Company Name: "+newText);
		System.out.println("Updated Company Name: "+UpdatedName);
	}
	}
	
	
	
	
	
	

	}


