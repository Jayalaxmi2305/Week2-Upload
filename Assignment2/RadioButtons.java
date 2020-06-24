package week2.Assignment2;

import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		// Are you enjoying the classes
		driver.findElementById("yes").click();
		//Find default selected radio button
		boolean RadioButton = driver.findElementByXPath("(//input[@name='news'])[1]").isSelected();
		System.out.println(RadioButton);
		//Select Age group
		boolean selected = driver.findElementByXPath("(//input[@class='myradio'])[1]").isSelected();
		if(selected==false)
		{
			driver.findElementByXPath("(//input[@class='myradio'])[1]").click();
		}
		System.out.println("Age group is already selected");
	}

}
