package AmazonUk;

import org.openqa.selenium.By;

public class LoginPage extends Utils {


    private By _todayDeal = By.xpath("//a[contains(text(),\"Today's Deals\")]");

    public void userClickOnDeals() {

        clickElementBy(_todayDeal);
    }
}
