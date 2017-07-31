package com.gk.test.step_definitions.gui;


import com.gk.test.framework.helpers.UrlBuilder;
import com.gk.test.framework.helpers.WebDriverHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

public class NavigationSteps {


    @Given("^i navigate to the Lloydspharmacy \"(.*?)\" page$")
    public void i_navigate_to_the_Lloydspharmacy_page(String pageName) throws Throwable {
//        if (pageName.equals("HOME")) {
            UrlBuilder.startAtHomePage();
//        }
    }


    @Then("^i search in google serach \"(.*?)\"$")
    public void iSearchInGoogleSerach(String Data) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebDriverHelper.getWebDriver().findElement(By.id("lst-ib")).sendKeys(Data);
        WebDriverHelper.getWebDriver().findElement(By.name("btnK")).click();
    }
}