package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Siva");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Nandha");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("1895siva@gmail.com");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("WIPRO");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("9790988132");
		
		WebElement drop1 = driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select sel1=new Select(drop1);
		sel1.selectByValue("Developer");
		WebElement drop2 = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select sel2=new Select(drop2);
		sel2.selectByValue("950");
		WebElement drop3 = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select sel3=new Select(drop3);
		sel3.selectByValue("GB");
		Thread.sleep(5000);
		WebElement chk = driver.findElement(By.xpath
				("//input[@id='SubscriptionAgreement']/following-sibling::div[@class='checkbox-ui']"));
		chk.click();
		

	}

}
