package stepDefinitions;

import base.CommonAPI;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class LandingPageSteps extends CommonAPI {
    @Given("^user is on Landing page$")
        public void user_is_on_Landing_page(){
        System.out.println("Usre is on Landing Page");
        }

    @Then("^user clicks on Your Amazon$")
    public void user_clicks_on_Your_Amazon() throws Throwable {
        driver.findElement(By.id("nav-your-amazon")).click();
        Thread.sleep(2000);
        driver.navigate().back();
    }

    @Then("^user clicks on Today's Deal$")
    public void user_clicks_on_Today_s_Deal() throws Throwable {
        driver.findElement(By.linkText("Today's Deals")).click();
        Thread.sleep(2000);
        driver.navigate().back();
    }

    @Then("^user clicks on Gift Cards$")
    public void user_clicks_on_Gift_Cards() throws Throwable {
        driver.findElement(By.linkText("Gift Cards")).click();
        Thread.sleep(2000);
        driver.navigate().back();
    }

    @Then("^user clicks on Whole Foods$")
    public void user_clicks_on_Whole_Foods() throws Throwable {
        driver.findElement(By.linkText("Whole Foods")).click();
       // Thread.sleep(2000);
        driver.navigate().back();
    }

    @Then("^user clicks on Registry$")
    public void user_clicks_on_Registry() throws Throwable {
        driver.findElement(By.linkText("Registry")).click();
        Thread.sleep(2000);
        driver.navigate().back();
    }

    @Then("^user clicks on Sell$")
    public void user_clicks_on_Sell() throws Throwable {
        driver.findElement(By.linkText("Sell")).click();
        Thread.sleep(2000);
        driver.navigate().back();
    }

    @Then("^user clicks on Help$")
    public void user_clicks_on_Help() throws Throwable {
        driver.findElement(By.linkText("Help")).click();
        Thread.sleep(2000);
        driver.navigate().back();
    }

    @Given("^user is already on Landing page$")
    public void user_is_already_on_Landing_page() throws Throwable {
        System.out.println("Usre is on Landing Page");
    }

    @When("^user clicks on serchbox$")
    public void user_clicks_on_serchbox() throws Throwable {
        driver.findElement(By.id("twotabsearchtextbox")).click();
    }

    @Then("^user enters iphone$")
    public void user_enters_iphone() throws Throwable {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
    }

    @Then("^user clicks on search button$")
    public void user_clicks_on_search_button() throws Throwable {
        driver.findElement(By.className("nav-input")).click();
    }

    @Then("^user clicks the first item$")
    public void user_clicks_the_first_item() throws Throwable {
        driver.findElement(By.id("pdagDesktopSparkleHeadline")).click();
    }

    @Then("^user goes back to home Page$")
    public void user_goes_back_to_home_Page() throws Throwable {
driver.quit();
    }


}

