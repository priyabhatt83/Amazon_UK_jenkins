package AmazonUk;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TodaysDealPage extends Utils {

    //private By _baby = By.xpath("//div[@class='a-fixed-left-grid widgetContainer aok-relative']//div[2]//span[3]//div[1]//label[1]//input[1]");
    private By _clothing = By.xpath("//div[@id='gb-supple149845223087156']");
    private By _silkgown = By.xpath("/div[@id='widgetFilters']//span[@class='a-label a-checkbox-label'][contains(text(),'Clothing')]");
    private By _selectcolour = By.xpath("//button[@id='a-autoid-29-announce']//div//div//img[@class='imgSwatch']");
    private By _selectsize = By.xpath("//select[@id='native_dropdown_selected_size_name']");
    private By _buynow = By.xpath("/input[@id='buy-now-button'");


    public void selectProduct(){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickElementBy(_clothing);
        clickElementBy(_silkgown);
        clickElementBy(_selectcolour);
        clickElementBy(_selectsize);
        clickElementBy(_buynow);
    }
}
