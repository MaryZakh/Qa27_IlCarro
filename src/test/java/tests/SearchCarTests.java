package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchCarTests extends TestBase{

    @BeforeMethod
    public void postCondition(){
        app.getHelperCar().navigateByLogo();
    }


    @Test
    public void searchCurrentMonthSuccess(){
        app.getHelperCar().searchCurrentMonth("Rehovot", "11/2/2024", "11/15/2024");
        app.getHelperCar().getScreen("src/test/screenshots/current.png");
        app.getHelperCar().submit();
        Assert.assertTrue(app.getHelperCar().isListCarsAppeared());
    }

    @Test
    public void searchCurrentYearSuccess(){
        app.getHelperCar().searchCurrentYear("Rehovot", "11/21/2024", "12/25/2024");
        app.getHelperCar().getScreen("src/test/screenshots/currentyear.png");
        app.getHelperCar().submit();
        Assert.assertTrue(app.getHelperCar().isListCarsAppeared());


    }

    @Test
    public void searchAnyPeriodSuccess(){
        app.getHelperCar().searchAnyPeriod("Rehovot", "12/15/2024", "02/13/2025");
        app.getHelperCar().getScreen("src/test/screenshots/any.png");
        app.getHelperCar().submit();
        Assert.assertTrue(app.getHelperCar().isListCarsAppeared());
    }
}
