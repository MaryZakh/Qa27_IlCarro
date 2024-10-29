package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchCarTests extends TestBase{


    @Test
    public void searchCurrentMonthSuccess(){
        app.getHelperCar().searchCurrentMonth("Haifa, Israel", "10/29/2024", "10/31/2024");
        app.getHelperCar().submit();
        Assert.assertTrue(app.getHelperCar().isListCarsAppeared());
    }

    @Test
    public void searchCurrentYearSuccess(){
        app.getHelperCar().searchCurrentYear("Haifa, Israel", "11/21/2024", "12/25/2024");
        app.getHelperCar().submit();
        Assert.assertTrue(app.getHelperCar().isListCarsAppeared());


    }

//    @Test
//    public void searchAnyPeriodSuccess(){
//        app.getHelperCar().searchAnyPeriod("Haifa, Israel", "12/15/2024", "02/13/2025");
//        app.getHelperCar().submit();
//        Assert.assertTrue(app.getHelperCar().isListCarsAppeared());
//    }
}
