import java.net.MalformedURLException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
public class Activity2 {
	
	
	WebDriverWait wait;
	AndroidDriver<MobileElement> driver = null;
	
	
	@BeforeClass
	public void  setup() throws MalformedURLException 	{
		
		DesiredCapabilities des = new DesiredCapabilities();
		des.setCapability("deviceName", "<Your device name>");
        des.setCapability("platformName", "Android");
        des.setCapability("automationName", "UiAutomator2");
        des.setCapability("appPackage", "com.android.chrome");
        des.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        des.setCapability("noReset", true);
        driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), des);
        wait = new WebDriverWait(driver, 10);
	}
	
        @Test
        public void testSearchAppium() {
            // Open page in browser
            driver.get("https://www.training-support.net/");
         // wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("About Us")));
            String pagetitle = driver.findElement(By.xpath("//android.view.View[@text='Training Support']")).getText();
            System.out.println("Page Title: "+pagetitle);
            MobileElement button = driver.findElementByXPath("//android.view.View[@text='About Us']");
            button.click();
     //       wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='About Us']")));
            String newPageTitle = driver.findElementByXPath("//android.view.View[@text='About Us']").getText();
            System.out.println("Title on new page: " + newPageTitle);
            Assert.assertEquals(pagetitle, "Training Support");
            Assert.assertEquals(newPageTitle, "About Us");
        }
        @AfterTest
        public void tearDown() {
            driver.quit();
        }
    	
	
	
}









