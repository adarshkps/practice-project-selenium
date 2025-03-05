package newProjectForPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExpandTesting {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.get("https://practice.expandtesting.com/otp-login");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("practice@expandtesting.com");
		driver.findElement(By.xpath("//button[@id='btn-send-otp']")).click();
		driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("214365");
		driver.findElement(By.xpath("//button[@id='btn-send-verify']")).click();
		
		
		
	
	
	
	}

}
