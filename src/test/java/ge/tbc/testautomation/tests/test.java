package ge.tbc.testautomation.tests;

import com.codeborne.selenide.Configuration;
import ge.tbc.testautomation.util.RetryAnalyzer;
import ge.tbc.testautomation.util.RetryCount;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test extends BaseTest{

    @Parameters("browserType")
    @BeforeClass
    public void setUp(String browserType){
        System.out.println("Logged in e-commerce application.");
        if(browserType.equals("chrome")){
            Configuration.browser = "chrome";
        } else if (browserType.equals("firefox")) {
            Configuration.browser = "firefox";
        }

    }
    @RetryCount(count=5)
    @Test(groups="purchase-test", retryAnalyzer = RetryAnalyzer.class)
    public void testFlakyDiscountCode(){
        System.out.println("test.testFlakyDiscountCode");
    }

    @Test(groups="purchase-test")
    public void addToCartTest(){
        System.out.println("test.addToCartTest");
    }

    @Test(dependsOnMethods = "addToCartTest",groups="purchase-test")
    public void proceedToCheckoutTest(){
        System.out.println("test.proceedToCheckoutTest");
    }
    @Test(dependsOnMethods = "proceedToCheckoutTest",groups="purchase-test")
    public void makePaymentTest(){
        System.out.println("test.makePaymentTest");
    }

    @Test(priority = 2, groups="functionality-test")
    public void validateImageSizes(){
        System.out.println("test.validateImageSizes");
    }

    @Test(priority = 1, groups="functionality-test")
    public void sortOffers(){
        System.out.println("test.sortOffers");
    }

    @Test(priority = 3, groups="functionality-test")
    public void validateBurgerMenu(){
        System.out.println("test.validateBurgerMenu");
    }

    @AfterClass
    public void tearDown(){
        Configuration.browser = "";
        System.out.println("INVALID.");
    }

}
