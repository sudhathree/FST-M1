package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Activity4 {
	
private WebDriver driver;
	
	@BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }
    @Test
    public void test() {
        // Check the title of the page
        String Header2 = driver.findElement(By.xpath("//h2[text()='Quia quis non']")).getText();
              
        
        
            //Assertion for page title
        Assert.assertEquals("Quia quis non", Header2);
        
       }
    @AfterMethod
    public void afterMethod() {
    	driver.close();
    	
        //Close the browser
        
    }
		
		
}