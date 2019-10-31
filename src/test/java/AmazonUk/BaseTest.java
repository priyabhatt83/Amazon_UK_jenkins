package AmazonUk;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;

public class BaseTest extends Utils {

    BrowserSelecter browserSelecter = new BrowserSelecter();

    @BeforeMethod//run before every method
    public void openBrowser(){
        browserSelecter.setUpBrowser();
        //Asking Driver to get the URL.
        driver.get("https://www.amazon.co.uk/");
    }

    @AfterMethod //run after every method //ITestResult result

    public void closeBrowser(ITestResult result) {

        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                File ts = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//Capture screen

                FileUtils.copyFile(ts, new File("Screenshots\\" + result.getName() + LongTimeStamp() + ".png"));//Store Screenshot to a file.

                System.out.println("Screenshot taken");

            } catch (Exception e) {

            }
           // driver.quit();
        }
    }
}
