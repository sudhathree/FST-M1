package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Activity6 {
	
private WebDriver driver;
WebDriverWait wait;

@BeforeMethod
public void beforeMethod() {
    //Create a new instance of the Firefox driver
    driver = new FirefoxDriver();
    wait = new WebDriverWait(driver, 10);
    
    //Open browser
    driver.get("https://alchemy.hguy.co/jobs/");
}

@Test
public void test() throws InterruptedException {
    
    WebElement jobs = driver.findElement(By.id("menu-item-24"));
            jobs.click();
    
    WebElement keyword = driver.findElement(By.id("search_keywords"));
    keyword.click();
    keyword.sendKeys("Banking");
    
    WebElement searchjobs = driver.findElement(By.xpath("//input[@value='Search Jobs']"));
    searchjobs.click();
    
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"post-7\"]/div/div/ul/li[1]")));
    
    WebElement joblist = driver.findElement(By.xpath("//h3"));
            joblist.click();
    
    WebElement apply = driver.findElement(By.xpath("//input[@value='Apply for job']"));
    apply.click();
    String email = driver.findElement(By.xpath("//a[contains(@class,'job_application_email')]")).getText();
    System.out.println("Email is "+email);
         
    
                
   }

@AfterMethod
public void afterMethod() {
    //Close the browser
    driver.quit();
}

}
