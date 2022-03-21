package com.cydeo.step_definitions;

import com.cydeo.pages.WikiMainPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Wiki_StepDefinitions {
    WikiMainPage wikiMainPage = new WikiMainPage();


    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("User types {string} in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box(String string) {
        wikiMainPage.searchBox.sendKeys(string);
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiMainPage.searchButton.click();
    }

    @Then("User sees {string} is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title(String string) {
        BrowserUtils.titleVerify(string+" - Wikipedia");
    }


    @Then("User sees {string} is in the main header")
    public void userSeesSteveJobsIsInTheMainHeader(String string) {
        Assert.assertTrue(wikiMainPage.mainHeader.isDisplayed());
        Assert.assertEquals(wikiMainPage.mainHeader.getText(),string);
    }
}
