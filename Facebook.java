package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Siva");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nandha");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9790988132");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Loading&09@123");
		
		WebElement drop1 = driver.findElement(By.xpath("//Select[@name='birthday_day']"));
		Select sel1=new Select(drop1);
		sel1.selectByVisibleText("18");
		WebElement drop2 = driver.findElement(By.xpath("//Select[@name='birthday_month']"));
		Select sel2=new Select(drop2);
		sel2.selectByVisibleText("May");
		WebElement drop3 = driver.findElement(By.xpath("//Select[@name='birthday_year']"));
		Select sel3=new Select(drop3);
		sel3.selectByVisibleText("1995");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		
		
		
		

	}

}
