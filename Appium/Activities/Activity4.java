package activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity4 {
    AndroidDriver<MobileElement> driver = null;
    WebDriverWait wait;

    @BeforeClass
    public void initializeTest() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 4 API 128");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.contacts");
        caps.setCapability("appActivity", ".activities.PeopleActivity");
        caps.setCapability("noReset", true);

        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver , 10);
    }

    @Test
    public void addContact() throws InterruptedException {
        Thread.sleep(100);
        driver.findElementById("floating_action_button_container").click();
        driver.findElement(MobileBy.xpath("//android.widget.EditText[@text='First name']")).sendKeys("Shruti");
        driver.findElement(MobileBy.xpath("//android.widget.EditText[@text='Last name']")).sendKeys("Walia");
        driver.findElementByClassName("android.widget.EditText").sendKeys("1234432");
        driver.findElementById("editor_menu_save_button").click();
        Thread.sleep(1000);

        MobileElement mobileCard = driver.findElementById("toolbar_parent");
        Assert.assertTrue(mobileCard.isDisplayed());

        String contactName = driver.findElementById("large_title").getText();
        Assert.assertEquals(contactName, "1234432 Walia");

    }

    @AfterClass
    public void afterClass() {
       // driver.quit();
    }

}
