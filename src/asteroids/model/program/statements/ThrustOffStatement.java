package asteroids.model.program.statements;

import asteroids.part3.programs.SourceLocation;


public class ThrustOffStatement extends ActionStatement {
	
	public ThrustOffStatement(SourceLocation sourceLocation){
		super(sourceLocation);
	}

	@Override
	public void execute() {
		getProgram().getShip().thrustOff();
	}
}