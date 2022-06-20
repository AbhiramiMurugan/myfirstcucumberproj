package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {

	WebDriver driver;

	@Given("user is already on home Page")
	public void user_already_on_home_page() {
		System.out.println("Iside Class 1");
		System.setProperty("webdriver.chrome.driver",
				"C://Users//vigne//eclipse-workspace//TestNgDemo//cucumbersample//src//main//resources//Browser//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://whiteboxqa.com/");
	}

	@When("title of home page")
	public void title_of_home_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("QA/QE/SDET Training.", title);
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();

	}

	@Then("user enters username and password")
	public void user_enters_username_and_password(String username,String password) {

		driver.findElement(By.name("uname")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	}

	@Then("user is on login page")
	public void user_is_on_login_page() {

		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"logo\"]")).isDisplayed());
	}

	@Then("Close the browser")

	public void close_the_browser() {
		driver.quit();
	}
}
