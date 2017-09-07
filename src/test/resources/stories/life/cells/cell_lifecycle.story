Meta:

Narrative:
As a Conway's Game of Life universe
I want to make cells evolve
So that we can see some beautiful patterns
					 
Scenario:  Cell reproduction
Given a dead cell
And the cell has 3 neighbours
When the cell evolves to next generation
Then the cell is now alive

Scenario:  Cell death by accident
Given a live cell
And the cell has 4 neighbours
When the cell evolves to next generation
Then the cell is now dead					