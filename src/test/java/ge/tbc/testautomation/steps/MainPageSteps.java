package ge.tbc.testautomation.steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import ge.tbc.testautomation.pages.CommonPage;
import ge.tbc.testautomation.pages.MainPage;

import static com.codeborne.selenide.Selenide.$x;

public class MainPageSteps {
    public MainPageSteps navigateToSport(){
        MainPage mainPage = new MainPage();
        mainPage.sportSection.click();
        return this;
    };
    public MainPageSteps navigateToCategory(String category){
        CommonPage commonPage = new CommonPage();
        SelenideElement categoryButton = $x("//p[contains(text(),'"+category+"')]/parent::a");
        Selenide.executeJavaScript("arguments[0].click();", categoryButton);

        return this;
    }
}
