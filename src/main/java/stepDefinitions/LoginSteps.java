package stepDefinitions;

import base.CommonAPI;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;

public class LoginSteps extends CommonAPI {
    @Given("^user is in the home page$")
    public void user_is_in_the_home_page (){
        System.out.println("You are in Home Page");
    }
    @When("^user hover over on signin area$")
    public void user_hover_over_on_signin_area() throws InterruptedException {
       mouseHoverByCSS(".nav-line-1");

    }

    @Then("^user clicks on signin button$")
    public void user_clicks_on_signin_button() throws Throwable {
        driver.findElement(By.linkText("Sign in")).click();

    }

    @Then("^put email or phone number in userid field$")
    public void put_email_or_phone_number_in_userid_field() throws Throwable {
        driver.findElement(By.id("ap_email")).sendKeys("kashem1956@gmail.com");


    }

    @Then("^put password om password field$")
    public void put_password_om_password_field() throws Throwable {
        driver.findElement(By.id("ap_password")).sendKeys("Kashem5000");

    }

    @Then("^user click on signin button$")
    public void user_click_on_signin_button() throws Throwable {
        driver.findElement(By.id("signInSubmit")).click();

    }
}
