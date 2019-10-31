package AmazonUk;


import org.testng.annotations.Test;

public class TestSuit extends BaseTest{


    LoginPage loginPage = new LoginPage();
    TodaysDealPage todaysDealPage = new TodaysDealPage();

  @Test
    public void homePage() {
       loginPage.userClickOnDeals();
      todaysDealPage.selectProduct();
   }
}
