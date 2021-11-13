package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/radio.html");
		driver.findElement(By.xpath("//input[@id='yes']")).click();
		WebElement radiobtn = driver.findElement(By.xpath("//label[@for='Checked']/input"));
		if(radiobtn.isSelected())
		{
			System.out.println("Radio button is selected");
		}
		else
		{
			System.out.println("radio button not selected");
		}
		WebElement radiobtn2 = driver.findElement(By.xpath("(//input[@name='age'])[2]"));
		if(radiobtn2.isSelected())
		{
			System.out.println("Radio button is already selected");
		}
		else
		{
			driver.findElement(By.xpath("(//input[@name='age'])[2]")).click();
		}
		
		

	}

}
