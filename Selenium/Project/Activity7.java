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
public class Activity7 {
	
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
public void test() {
    
    WebElement postajob = driver.findElement(By.id("menu-item-26"));
    postajob.click();
    
    WebElement yourEmail = driver.findElement(By.id("create_account_email"));
    yourEmail.sendKeys("test@gmai.com");
    
    WebElement jobTitle = driver.findElement(By.id("job_title"));
    jobTitle.sendKeys("TestLead");
    
    WebElement desc = driver.findElement(By.id("job_description_ifr"));
    desc.sendKeys(" TestLead");
    
    WebElement applEmail = driver.findElement(By.id("application"));
    applEmail.sendKeys("sxyz@gmail.com");
    
    WebElement companyName = driver.findElement(By.id("company_name"));
    companyName.sendKeys("IBMINDIA");
    
    WebElement preview = driver.findElement(By.xpath("//input[@value='Preview']"));
    preview.click();
    
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Submit Listing']")));
    
    WebElement sublisting = driver.findElement(By.xpath("//input[@value='Submit Listing']"));
    sublisting.click();
    
    driver.findElement(By.xpath("//a[text()='click here']")).click(); 
    
    //Assert Message
    String role = driver.findElement(By.xpath("//h1[contains(@class,'entry-title')]")).getText();
    Assert.assertEquals(role, "TestLead");
                   
    
                
   }

@AfterMethod
public void afterMethod() {
    //Close the browser
    driver.quit();
}


}
