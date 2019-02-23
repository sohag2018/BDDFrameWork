package stepDefinitions;

import base.CommonAPI;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
public class ManyLoginSteps extends CommonAPI {

    @Given("^user is in the signin page$")
    public void user_is_in_the_home_page() throws InterruptedException {
        mouseHoverByCSS(".nav-line-1");
        driver.findElement(By.linkText("Sign in")).click();
        Thread.sleep(2000);
    }

    @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\">$")
    public void user_enters_and(String username, String password) throws Throwable {
        driver.findElement(By.id("ap_email")).sendKeys(username);
        driver.findElement(By.id("ap_password")).sendKeys(password);
        driver.findElement(By.id("signInSubmit")).click();
    }
}

