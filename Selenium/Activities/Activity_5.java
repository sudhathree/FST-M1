package ActivitiesSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5 {
	
	public static void main(String[] args) {
		
		WebDriver  driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("firstName")).sendKeys("sudheer");
		driver.findElement(By.id("lastName")).sendKeys("venkata");
		driver.findElement(By.id("contactnumber")).sendKeys("9876535464");
		driver.findElement(By.xpath("//div/textarea[@rows=\"2\"]")).sendKeys("example");

	}
	
}
