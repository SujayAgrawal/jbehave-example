package life.at;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.junit.Assert.*;

public class CellSteps {

	private boolean cellIsDead;
	private int numberOfLiveNeighbours;

	@Given("a dead cell")
	public void givenADeadCell() {
	  this.cellIsDead = true;
	}
	
	@Given("a live cell")
	public void givenALiveCell() {
	  this.cellIsDead = false;
	}

	@Given("the cell has $livecells neighbours")
	public void givenTheCellHas3Neighbours(int livecells) {
	  this.numberOfLiveNeighbours = livecells;
	}

	@When("the cell evolves to next generation")
	public void whenTheCellEvolvesToNextGeneration() {
	  this.cellIsDead = this.numberOfLiveNeighbours > 3;
	}

	@Then("the cell is now alive")
	public void thenTheCellIsNowAlive() {
	  assertFalse(this.cellIsDead);
	}
	
	@Then("the cell is now dead")
	public void thenTheCellIsNowDead() {
	  assertTrue(this.cellIsDead);
	}

}
