package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {

    public WebTablePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;


    /**
     * No parameters.
     * When we call this method, it will directly log in using:
     *
     * Username: Test
     * Passwor: Tester
     */

public void login(){
    this.usernameInput.sendKeys("Test");
    this.usernameInput.sendKeys("Tester");
    this.loginButton.click();
}

    /**
     * This method will accept two arguments and login.
     * @param username
     * @param password
     */
    public void login(String username, String password){
    this.usernameInput.sendKeys(username);
    this.passwordInput.sendKeys(password);
    this.loginButton.click();


}


}
