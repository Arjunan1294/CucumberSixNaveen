package parallel;



import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageSteps {
	
	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://www.google.co.in/");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		 title = loginPage.getLoginPageTitle();
		System.out.println("LoginPage title is" +title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		Assert.assertTrue(title.contains(expectedTitle));
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
		Assert.assertTrue(loginPage.isForgotPasswordLinkExist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String userName) {
		loginPage.enterUserName(userName);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) throws InterruptedException {
		loginPage.enterPassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		loginPage.clickOnLogin();
	}



	
}
