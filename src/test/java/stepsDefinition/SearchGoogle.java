package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {

    // Defined ChromeDriver
    private ChromeDriver driver;

    @Given("Load Google website")
    public void loadGoogleWebsite() throws InterruptedException {
        // Driver locate
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        // Constructor
        driver = new ChromeDriver();
        // Load home page
        driver.get("https://www.google.com/");
        // Window maximize
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
    @When("Look up the word Lion")
    public void lookUpTheWordLion() throws InterruptedException {
        // WebElement
        WebElement inputSearch = driver.findElement(By.name("q"));
        // Method
        inputSearch.clear();
        inputSearch.sendKeys("Leon");
        inputSearch.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }
    @Then("Result is displayed Lion")
    public void resultIsDisplayedLion() {
        // Validate search
        String title = driver.getTitle();
        // Assert
        Assert.assertEquals(title,"Leon - Buscar con Google");
        // Close window
        driver.close();
    }

}
