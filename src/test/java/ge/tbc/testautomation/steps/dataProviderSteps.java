package ge.tbc.testautomation.steps;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebElementsCondition;
import ge.tbc.testautomation.Constants;

import static com.codeborne.selenide.Selenide.*;

public class dataProviderSteps {
    public static Object[][] dynamicData(){
        open(Constants.DATA_URL);

        ElementsCollection sportEventOffers = $$x("//a[contains(@href,'offers')]");
        Object[][] data = new Object[10][3];
        for(int i=0 ;i<10;i++){
            SelenideElement sportOffer = sportEventOffers.get(i);

            double discountPercent = Double.parseDouble(sportOffer.$x(".//p[contains(.,'%')]").getText().replaceAll("[^0-9]", ""));
            double discountedPrice = Double.parseDouble(sportOffer.$x(".//p[contains(.,'₾')]").getText().replaceAll("[^0-9]", ""));
            double originalPrice = Double.parseDouble(sportOffer.$x(".//p[contains(.,'₾')][2]").getText().replaceAll("[^0-9]", ""));

            data[i][0] = discountPercent;
            data[i][1] = discountedPrice;
            data[i][2] = originalPrice;

        }
        System.out.println("SportEventOffers size: " + data.length);
        return data;
    }
}
