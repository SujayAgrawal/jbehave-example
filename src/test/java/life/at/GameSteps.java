package life.at;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class GameSteps {

	private boolean robot;
	private String iSayPermission;
	
	@Given("robot")
	public void givenRobot() {
	  this.robot = true;
	}

	@When("I say permission")
	public void whenISayPermission() {
	  this.iSayPermission="permission";
	}

	@Then("robot should go to my mom and ask on my behalf whether I can go to play or not")
	public void thenRobotShouldGoToMyMomAndAskOnMyBehalfWhetherICanGoToPlayOrNot() {
	 assertTrue(robot);
	 assertEquals("permission", iSayPermission);
	}
}
