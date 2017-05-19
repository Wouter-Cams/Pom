package asteroids.model.program.statements;

import java.util.List;

import asteroids.part3.programs.SourceLocation;


public class SequenceStatement extends Statement{
	
	private List<Statement> statements;
	
	public SequenceStatement(SourceLocation sourceLocation, List<Statement> statements) {
		super(sourceLocation);
		this.statements = statements;
	}
	
	private int index = 0;
	
	public Statement getCurrentStatement() {
		return this.statements.get(index);
	}
	
	
	/**
	 * Go to the next statement of the sequence statement
	 */
	public void gotoNextStatement() {
		// if the current statement is also a sequence statement
		if (getCurrentStatement() instanceof SequenceStatement) {
			if (((SequenceStatement) getCurrentStatement()).isCompletelyExecuted()) {
				this.index += 1;
			} else {
				((SequenceStatement) getCurrentStatement()).gotoNextStatement();
			}
		}
		this.index += 1;
	}
	
	public boolean isCompletelyExecuted() {
		return this.index >= this.statements.size();
	}
	
	
	/*
	@Override
	public void execute() {
		for (Statement statement : statements){
			statement.execute();
		}
	}
	*/
}