package newProjectForPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class calenderTask {
public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
			Actions act=new Actions(driver);
			WebElement cal=driver.findElement(By.xpath("//input[@class='hasDatepicker']"));
			act.click(cal).build().perform();
			Thread.sleep(2000);
			WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
			act.click(next).build().perform();
			Thread.sleep(2000);
			WebElement date=driver.findElement(By.xpath("//a[text()='10']"));
			act.click(date).build().perform();
	
}
}
