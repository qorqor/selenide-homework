package ge.tbc.testautomation.tests;

import com.codeborne.selenide.Configuration;
import ge.tbc.testautomation.Constants;
import ge.tbc.testautomation.steps.CommonPageSteps;
import ge.tbc.testautomation.steps.MainPageSteps;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class ParametrizedSwoopTests2 {

    String category;

    public ParametrizedSwoopTests2(String category){
        this.category=category;
    }

    @BeforeClass
    public void setUp(){
        open(Constants.SWOOP_URL);
        Configuration.timeout = 8000;
    }
    @Test(priority = 1)
    public void filterTest(){
        MainPageSteps mainPageSteps = new MainPageSteps();
        CommonPageSteps commonPageSteps = new CommonPageSteps();

        mainPageSteps
                .navigateToCategory(category);
        commonPageSteps
                .chooseFilterOption();
    }
    @Test(priority = 2)
    public void rangeTest(){
//        CommonPageSteps commonPageSteps = new CommonPageSteps();
//        MainPageSteps mainPageSteps = new MainPageSteps();
//
//        mainPageSteps.navigateToCategory(category);
//        commonPageSteps.changePriceSlider();
    }

    @AfterClass
    public void tearDown(){
        Configuration.browser = "";
    }
}
