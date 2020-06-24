package assignment1.week2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement eleUser=driver.findElementById("username");
		eleUser.sendKeys("Demosalesmanager");
		WebElement elePassword = driver.findElementById("password");
		elePassword.sendKeys("crmsfa");
		WebElement eleLogin = driver.findElementByClassName("decorativeSubmit");
		eleLogin.click();
		WebElement eleLink = driver.findElementByLinkText("CRM/SFA");
		eleLink.click();
driver.findElementByLinkText("Leads").click();
driver.findElementByLinkText("Create Lead").click();
WebElement eleCompanyName = driver.findElementByXPath("//input[@id='createLeadForm_companyName']");
eleCompanyName.sendKeys("Testleaf");
WebElement eleFirstName = driver.findElementByXPath(("//input[@id='createLeadForm_firstName'][1]"));
eleFirstName.sendKeys("Jaya Lakshmi");
WebElement eleLastName = driver.findElementByXPath("//input[@id='createLeadForm_lastName']");
eleLastName.sendKeys("Rajagopal");
WebElement eleDD1 = driver.findElementByXPath(("(//select[contains(@id,'createLeadForm')])[1]"));
Select dd1=new Select(eleDD1);
dd1.selectByValue("LEAD_EMPLOYEE");
WebElement eleValue = driver.findElementByXPath("//input[contains(@id,'annualRevenue')]");
eleValue.sendKeys("200000");
WebElement eleDD2 = driver.findElementByXPath(("//select[contains(@id,'industryEnumId')]"));
Select dd2=new Select(eleDD2);
dd2.selectByVisibleText("Computer Software");
WebElement eleDD3 = driver.findElementByXPath(("//select[contains(@name,'ownership')]"));
Select dd3=new Select(eleDD3);
dd3.selectByIndex(4);
driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("Selenium Automation Tester");
WebElement eleDD4 = driver.findElementByXPath("//select[contains(@id,'marketingCampaignId')]");
Select dd4=new Select(eleDD4);
dd4.selectByIndex(6);
WebElement eleDD5 = driver.findElementByXPath("//select[contains(@id,'generalStateProvinceGeoId')]");
Select dd5=new Select(eleDD5);
dd5.selectByValue("TX");
driver.findElementById("createLeadForm_primaryEmail").sendKeys("jra@test.com");
driver.findElementByName("primaryPhoneNumber").sendKeys("9867564534");
driver.findElementByXPath("//input[@type='submit']").click();

	}

}
