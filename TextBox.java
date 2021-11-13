package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("1895siva@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Siva");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(Keys.TAB);
		String text=driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("Value");
		System.out.println(text);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		if (enabled == true)
		{
			System.out.println("Textbox is Enabled ");
		}
		else
		{
			System.out.println("Textbox is Disabled ");
		}
		
		

	}

}
