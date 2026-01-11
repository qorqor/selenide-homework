package ge.tbc.testautomation.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import ge.tbc.testautomation.pages.CommonPage;
import org.openqa.selenium.Keys;

public class CommonPageSteps {
    public CommonPageSteps chooseFilterOption(){
        CommonPage commonPage = new CommonPage();
        Selenide.executeJavaScript("arguments[0].click();", commonPage.priceFilter);
        Selenide.executeJavaScript("arguments[0].click();", commonPage.priceOption);

        return this;

    }
    public CommonPageSteps changePriceSlider(){
        CommonPage commonPage = new CommonPage();
        if(commonPage.closeAuth.exists()) {commonPage.closeAuth.click();}
        Selenide.executeJavaScript("arguments[0].scrollIntoView();", commonPage.priceFilter);
        Selenide.executeJavaScript("arguments[0].click();", commonPage.priceFilter);
        commonPage.priceFilter.shouldBe(Condition.visible);
        Selenide.executeJavaScript("arguments[0].style.right='40%';", commonPage.priceSlider);
        return this;
    }
}
