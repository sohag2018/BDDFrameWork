package stepDefinitions;

import base.CommonAPI;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;



public class SearchSteps extends CommonAPI {

@Given("^user in the home page$")
public void user_in_the_home_page (){
    System.out.println("You are in Home Page");

}
    @Then("^user click on searchbox$")
    public void user_click_on_searchbox()throws Throwable {
driver.findElement(By.id("twotabsearchtextbox")).click();

    }

    @Then("^user put text on searchbox$")
    public void user_put_text_on_searchbox(){
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Computer");
    }

    @Then("^user click searchbutton$")
    public void user_click_searchbutton() {
    driver.findElement(By.className("nav-input")).click();

    }

    @Then("^user clear the searchbox$")
    public void user_clear_the_searchbox() throws InterruptedException {
Thread.sleep(2000);
driver.quit();

    }







}
