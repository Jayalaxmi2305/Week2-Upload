package week2.Assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class BondWithButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Click Button to travel home page
		driver.findElementByXPath("//button[@id='home']").click();
		driver.navigate().back();
		//Get position
		Point position = driver.findElementByXPath("//button[@id='position']").getLocation();
		System.out.println(position);
		//Find Button Color
		String color = driver.findElementById("color").getCssValue("background-color");
        System.out.println(color);
        //Find the height and Width
        Dimension dimension = driver.findElementById("size").getSize();
        System.out.println(dimension);
	}

}
