package week2.day2;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		WebElement position = driver.findElement(By.xpath("//button[text()='Get Position']"));
		Point clasname=position.getLocation();
		int xcoord=clasname.getX();
		int ycoord=clasname.getY();
		System.out.println("Position of button("+xcoord+","+ycoord+")");
		String bgcolor = driver.findElement(By.xpath("//button[text()='What color am I?']")).getCssValue("background-color");
		System.out.println(bgcolor);
		WebElement size = driver.findElement(By.xpath("//button[text()='What is my size?']"));
		int width = size.getSize().getWidth();
		int height = size.getSize().getHeight();
		System.out.println("Height:"+height+"-Width:"+width);
		
		

	}

}
