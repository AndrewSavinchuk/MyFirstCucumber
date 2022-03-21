package com.cydeo.utilities;

/*
In this class only general utility methods that are not related to some specific page.
 */

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class BrowserUtils {

    /*
    This method will accept int (in seconds) and execute Thread.sleep
    for given duration
     */
    public static void sleep(double second){

        try {
            Thread.sleep( (int)second*1000);
        }catch (InterruptedException e ) {
            e.printStackTrace();
        }
    }

    // Method to find a window with expected URL
    public static WebDriver switchWindowAndVerify(String expectedInUrl){

        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowsHandles) {
            Driver.getDriver().switchTo().window(each);
            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) break;
        }
        return Driver.getDriver();
    }

    public static void titleVerify(String expectedTitle){
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    public static void titleContains(String expectedTitle){
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    public static void verifyURLContains(String expectedInURL) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURL));
    }


    public static void scrollPage(int y, int x){
        // Use below JavaScript method and scroll
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy("+y+","+x+")");
    }

}