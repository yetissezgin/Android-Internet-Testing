package Test;

import java.net.MalformedURLException;
import org.openqa.selenium.By;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InternetConnectionControlTest extends CommonMethods {
	CommonMethods common;
	@Before
	public void connection() {
		common=new CommonMethods();
	}
	@After
	public void tearDown()	{
		common.closeConnection();
	}
	@Given("^User is on Setting$")
	public void user_is_on_Setting() throws MalformedURLException {
		common.setUp();
	}
	@When("^User clicks Connections$")
	public void user_clicks_Connections() {
		common.click(By.xpath("//android.widget.TextView[@text='Connections']"));
	}
	@Then("^if the internet is not connected, user turns on Wifi$")
	public void if_the_internet_is_not_connected_user_turns_on_Wifi() {
		common.turnOn(By.xpath("//android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Switch"));
	}
	@Then("^if the location is not on, user turns on Wifi$")
	public void if_the_location_is_not_on_user_turns_on_Wifi() {
		common.turnOn(By.xpath("//android.widget.ListView/android.widget.LinearLayout[9]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Switch"));
	}
	@Then("^User clicks Home button$")
	public void user_clicks_Home_button() {
		common.HomeButton();
	}
	
}
