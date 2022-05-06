import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/ajax");
		System.out.println("the title of the page :" + driver.getTitle() );
		driver.findElement(By.xpath("//button[text()='Change Content']")).click();
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='HELLO!']")));
		System.out.println(driver.findElement(By.xpath("//div[@id='ajax-content']/h3")).getText());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'late')]")));
		System.out.println(driver.findElement(By.xpath("//div[@id='ajax-content']/h3")).getText());
	}

}
