package ge.tbc.testautomation.tests;

import com.codeborne.selenide.Configuration;
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

    @Test(invocationCount = 5, successPercentage = 60)
    public void testFlakyDiscountCode(){
        System.out.println("test.testFlakyDiscountCode");
    }

    @Test
    public void addToCartTest(){
        System.out.println("test.addToCartTest");
    }

    @Test(dependsOnMethods = "addToCartTest")
    public void proceedToCheckoutTest(){
        System.out.println("test.proceedToCheckoutTest");
    }
    @Test(dependsOnMethods = "proceedToCheckoutTest")
    public void makePaymentTest(){
        System.out.println("test.makePaymentTest");
    }

    @Test(priority = 2)
    public void validateImageSizes(){
        System.out.println("test.validateImageSizes");
    }

    @Test(priority = 1)
    public void sortOffers(){
        System.out.println("test.sortOffers");
    }

    @Test(priority = 3)
    public void validateBurgerMenu(){
        System.out.println("test.validateBurgerMenu");
    }

    @AfterClass
    public void tearDown(){
        Configuration.browser = "";
        System.out.println("Logged out of e-commerce application.");
    }

}
