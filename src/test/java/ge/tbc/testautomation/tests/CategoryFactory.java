package ge.tbc.testautomation.tests;

import org.testng.annotations.Factory;

public class CategoryFactory {
    @Factory
    public Object[] create(){
        return new Object[]{
                new ParametrizedSwoopTests2("დასვენება"),
                new ParametrizedSwoopTests2("გართობა"),
                new ParametrizedSwoopTests2("კვება"),

        };
    }
}
