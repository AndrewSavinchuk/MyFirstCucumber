package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    //@When("user types {word} and clicks enter")
    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String string) {
        googleSearchPage.searchBox.sendKeys(string + Keys.ENTER);

    }

    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String string) {
        BrowserUtils.titleContains(string);
    }

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().get("https://www.google.com");

    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {

        BrowserUtils.titleVerify("Google");
        Driver.closeDriver();

    }

    @When("user types apple and clicks enter")
    public void userTypesAppleAndClicksEnter() {
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);

    }

    @Then("user sees apple in the google title")
    public void userSeesAppleInTheGoogleTitle() {
        BrowserUtils.titleVerify("apple - Google Search");
        BrowserUtils.titleContains("apple");
    }

}
