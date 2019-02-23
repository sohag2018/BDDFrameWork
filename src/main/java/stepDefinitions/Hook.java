package stepDefinitions;

import base.CommonAPI;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends CommonAPI {

@Before
public  void initializeTest() {

    System.setProperty("webdriver.chrome.driver","C:\\Users\\nafas\\Desktop\\Clone\\Aurnob\\REST_API\\AmazonBDD\\browser-driver\\chromedriver.exe");
    driver =new ChromeDriver();
    driver.navigate().to("https://www.amazon.com/");
    driver.manage().window().maximize();
}

@After
    public void tearDownTest(Scenario scenario) {
        driver.quit();
    }
}
