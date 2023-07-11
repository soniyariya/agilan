package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	
	
       WebDriver driver = null;


	@Given("hit the url")
	public void hit_the_url() {
	  
	System.getProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.navigate().to("https://testapp.inlink.pro/");
	
	
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String userName, String password) {
		
		driver.findElement(By.xpath("//input[@id='outlined-basic1']")).sendKeys(userName);
		driver.findElement(By.xpath("(//input[@id='outlined-adornment-password undefined'])[1]")).sendKeys(password);
		
	    
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	   
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	   
	}



}
