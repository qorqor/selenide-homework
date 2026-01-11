package ge.tbc.testautomation.tests;

import com.codeborne.selenide.Configuration;
import ge.tbc.testautomation.Constants;
import ge.tbc.testautomation.data.DataSupplier;
import ge.tbc.testautomation.pages.MainPage;
import ge.tbc.testautomation.steps.MainPageSteps;
import ge.tbc.testautomation.steps.SportPageSteps;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class ParametrizedSwoopTests {
    @BeforeClass
    public void setUp(){
        Configuration.browser = "chrome";
        open(Constants.SWOOP_URL);
        Configuration.timeout = 8000;

    }
    @Test(dataProviderClass = DataSupplier.class, dataProvider = "sportsOffers")
    public void checkSaleValuesTest(double discountPercent, double discountedPrice, double originalPrice){
        MainPageSteps mainPageSteps = new MainPageSteps();
        SportPageSteps sportPageSteps = new SportPageSteps();

        mainPageSteps
                .navigateToSport();
        sportPageSteps
                .validateOfferPrice(discountPercent, discountedPrice, originalPrice);

    }
    @AfterClass
    public void tearDown(){
        Configuration.browser = "";
    }
}
