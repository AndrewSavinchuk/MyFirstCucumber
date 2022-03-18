package com.cydeo.step_definitions;

// In this clas we will be able to pass pre- & post- conditions
// to each scenario and each step


import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    // import from io.cucumber.java not from junit
    @Before(order = 0)
    public void setupScenario() {
        System.out.println("====Setting up browser user cucumber @Before====");
    }

    @Before(value = "@login", order = 1)
    public void setupScenarioForLogins() {
        System.out.println("====This will only apply to scenarios with @login tag====");
    }

    @Before("@db")
    public void setupForDatabaseScenarios() {
        System.out.println("====This will only apply to scenarios with @db tag====");
    }

    @After
    public void teardownScenario() {

        byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        Driver.closeDriver();
        System.out.println("====Setting up browser user cucumber @After====");
//        System.out.println("====Scenario ended / if failed take a screenshot====");

    }

    //@BeforeStep
    public void setupStep(){
        System.out.println("---- applying setup using @BeforeStep");
    }

    //@AfterStep
    public void afterStep(){
        System.out.println("---- applying tearDown using @AfterStep");
    }

}
