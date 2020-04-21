package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinition {
	
	WebDriver driver;
	@Given("the User Opens the Browser and load the Application")
	public void the_User_Opens_the_Browser_and_load_the_Application() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		throw new io.cucumber.java.PendingException();
	}

	@Given("the User Enters the Valid UserName and PassWord")
	public void the_User_Enters_the_Valid_UserName_and_PassWord() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Clicks on Login Button")
	public void clicks_on_Login_Button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User Should go to HomePage")
	public void user_Should_go_to_HomePage() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("","");
		driver.close();
	    throw new io.cucumber.java.PendingException();
	}

	@Given("the User Enters the InValid UserName and PassWord")
	public void the_User_Enters_the_InValid_UserName_and_PassWord() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("admin");
		   
		throw new io.cucumber.java.PendingException();
	}
	
	@Then("User Should get Error Message")
	public void user_Should_get_Error_Message() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement errmsg = driver.findElement(By.xpath("//span[.='Username or Password is invalid. Please try again.']"));
	    String msg=errmsg.getText();
		throw new io.cucumber.java.PendingException();
	}


}
