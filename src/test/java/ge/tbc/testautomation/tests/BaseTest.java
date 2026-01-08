package ge.tbc.testautomation.tests;
import org.testng.annotations.*;

public class BaseTest {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Connection to DB opened!");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("Connection to DB closed!");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Change : Browser started working!");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Browser finished working!");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Navigated to home page!");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Returned to home page");
    }
}
