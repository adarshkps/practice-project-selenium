package newProjectForPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadConfigFiles {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		WebElement user = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.id("password"));
		File file = new File("./config2.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties pr = new Properties();
		pr.load(fis);
		String u = pr.getProperty("username");
		String p = pr.getProperty("password");
		System.out.println(u);
		System.out.println(p);
		if (u.equals("practice"))
		{
			user.sendKeys(u);
			
			if (p.equals("SuperSecretPassword!")) 
			{
				pass.sendKeys(p);
			}

		}
		driver.findElement(By.xpath("//button[text()='Login']")).click();

	}

}
