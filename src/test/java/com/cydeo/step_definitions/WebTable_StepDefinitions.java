package com.cydeo.step_definitions;

import com.cydeo.pages.WebTablePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebTable_StepDefinitions {

    WebTablePage webTablePage = new WebTablePage();

    @Given("user is on the login page of a web table app")
    public void user_is_on_the_login_page_of_a_web_table_app() {
        String url = ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);

    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        webTablePage.usernameInput.sendKeys(string);
    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        webTablePage.passwordInput.sendKeys(string);
    }


    @When("user clicks Login button")
    public void user_clicks_login_button() {
        webTablePage.loginButton.click();
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        BrowserUtils.verifyURLContains("orders");
    }


    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String password) {
        webTablePage.usernameInput.sendKeys(username);
        webTablePage.passwordInput.sendKeys(password);
        webTablePage.loginButton.click();
    }
}
