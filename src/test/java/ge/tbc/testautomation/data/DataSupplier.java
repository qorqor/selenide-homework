package ge.tbc.testautomation.data;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ge.tbc.testautomation.Constants;
import ge.tbc.testautomation.pages.SportPage;
import ge.tbc.testautomation.steps.dataProviderSteps;
import org.testng.annotations.DataProvider;
import static com.codeborne.selenide.Selenide.*;


public class DataSupplier {
    @DataProvider(name = "sportsOffers")
    public static Object[][] sportsOffersProvider(){
        return dataProviderSteps.dynamicData();
    }
}

