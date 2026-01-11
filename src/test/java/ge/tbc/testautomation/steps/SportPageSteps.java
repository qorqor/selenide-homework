package ge.tbc.testautomation.steps;


import org.testng.Assert;

public class SportPageSteps {
    public SportPageSteps validateOfferPrice(double discountPercent, double discountedPrice, double originalPrice){

        Assert.assertEquals(discountedPrice, Math.round(originalPrice * (1 - discountPercent / 100.0)));
        return this;
   }
}
