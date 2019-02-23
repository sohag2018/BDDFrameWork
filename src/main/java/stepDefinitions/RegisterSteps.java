package stepDefinitions;

import base.CommonAPI;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class RegisterSteps extends CommonAPI {
    @Given("^user is home page$")
    public void user_is_home_page (){
        System.out.println("You are in Home Page");
    }
    @When("^user Hovers over in signin area$")
    public void user_Hovers_over_in_signin_area() throws Throwable {
        mouseHoverByCSS(".nav-line-1");
    }
    @Then("^user click on sign in button$")
    public void user_click_on_sign_in_button() throws Throwable {
        driver.findElement(By.linkText("Sign in")).click();
    }

    @Then("^user click on create account button$")
    public void user_click_on_create_account_button() throws Throwable {
        driver.findElement(By.linkText("Create your Amazon account")).click();
    }

    @Then("^user enters username$")
    public void user_enters_username() throws Throwable {
    driver.findElement(By.id("ap_customer_name")).sendKeys("Tufayel");
    }

    @Then("^user enters email$")
    public void user_enters_email() throws Throwable {
    driver.findElement(By.id("ap_email")).sendKeys("tufa123@gmail.com");
    }

    @Then("^user enters password$")
    public void user_enters_password() throws Throwable {
    driver.findElement(By.id("ap_password")).sendKeys("test123");
    }

    @Then("^user re-enters password$")
    public void user_re_enters_password() throws Throwable {
driver.findElement(By.id("ap_password_check")).sendKeys("test123");
    }

    @Then("^user closes browser instead clicking create button$")
    public void user_closes_browser_instead_clicking_create_button() throws Throwable {
    driver.quit();
    }





}
