package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver = BaseClass.driver;

	@Given("I have opened the application in the browser")
	public void i_have_opened_the_application_in_the_browser() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://www.simplilearn.com");
		Thread.sleep(2000);
	}

	@When("I click on the Login Link")
	public void i_click_on_the_login_link() {
		// Write code here that turns the phrase above into concrete actions
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
	}

	@When("I enter the username")
	public void i_enter_the_username() {
		// Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("xyz@abc.com");
	}

	@When("I enter the password")
	public void i_enter_the_password() {
		// Write code here that turns the phrase above into concrete actions
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Abcd@123");
	}

	@Then("I should land on the home page")
	public void i_should_land_on_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside home page");
	}

	@When("I enter the username {string}")
	public void i_enter_the_username(String UserNameVal) {
		// Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(UserNameVal);
	}

	@When("I enter the password {string}")
	public void i_enter_the_password(String PasswordVal) {
		// Write code here that turns the phrase above into concrete actions
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(PasswordVal);
	}

	@When("I click on the Login Button")
	public void i_click_on_the_login_button() {
		// Write code here that turns the phrase above into concrete actions
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
	}

	@Then("I should get the message {string}")
	public void i_should_get_the_message(String ExpectedMsg) {
		// Write code here that turns the phrase above into concrete actions
		WebElement msgbox = driver.findElement(By.id("msg_box"));
		String ActualMsg = msgbox.getText();
		Assert.assertEquals(ExpectedMsg, ActualMsg);
	}

}
