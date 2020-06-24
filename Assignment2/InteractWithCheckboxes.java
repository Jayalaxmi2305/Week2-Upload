package week2.Assignment2;

import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithCheckboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		//Select the languages that you know
        driver.findElementByXPath("(//input[@type='checkbox'])[1]").click();
        driver.findElementByXPath("(//input[@type='checkbox'])[3]").click();
        // Confirm Selenium is Checked
        boolean Checkbox = driver.findElementByXPath("(//input[@type='checkbox'])[6]").isSelected();
        System.out.println(Checkbox);
        //Deselect only Checked
        driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();
        //Select all below checkboxes 
        driver.findElementByXPath("(//input[@type='checkbox'])[9]").click();
        driver.findElementByXPath("(//input[@type='checkbox'])[10]").click();
        driver.findElementByXPath("(//input[@type='checkbox'])[11]").click();
        driver.findElementByXPath("(//input[@type='checkbox'])[12]").click();
        driver.findElementByXPath("(//input[@type='checkbox'])[13]").click();
	}

}
