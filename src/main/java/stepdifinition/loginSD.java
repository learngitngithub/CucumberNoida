package stepdifinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.sql.SQLOutput;

public class loginSD {

    WebDriver driver;

    @Given("I am on login page")
    public void I_am_on_login_page()
    {
        System.out.println("I am on login page");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");
    }

    @When("I enter correct username and correct password")
    public void I_enter_correct_username_and_correct_password()
    {
        System.out.println("I enter correct username and correct password");
        driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");

    }

    @And("click on login button")
    public void click_on_login_button()
    {
        System.out.println("click on login button");
        driver.findElement(By.xpath("//input[contains(@name, 'submit')]")).click();
    }
    @Then("I should land on Home page")
    public void I_should_land_on_Home_page()
    {
        System.out.println("I should land on Home page");
       // String expected="POSNIC - Login to Control Panel";
        String expected="POSNIC - Dashboard";
        String actual=driver.getTitle();
        Assert.assertEquals("the title is not correct",expected, actual);

    }

}
