package ge.tbc.testautomation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CommonPage {
    public SelenideElement priceFilter = $x("//p[text()='ფასი']/parent::button");
    public SelenideElement priceOption = $x(".//p[text()='0 ₾ - 100 ₾']");
    public SelenideElement closeAuth = $x("//button[@aria-label='Close']");
    public SelenideElement eventLocation = $x("//p[text()='მდებარეობა']/parent::button");
    public SelenideElement dighomiSelector = eventLocation.$x("./following::div[@class='cursor-pointer']");
    public SelenideElement priceSlider = $x("//div[@class='absolute h-full bg-hotpink-100 rounded-full' and @role='none']");

}
