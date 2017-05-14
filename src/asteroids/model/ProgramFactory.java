package asteroids.model;

import java.util.List;

import asteroids.part3.programs.IProgramFactory;
import asteroids.part3.programs.SourceLocation;

public class ProgramFactory implements IProgramFactory<Expression, Statement, Function, Program>{

	@Override
	public Program createProgram(List<Function> functionList, Statement main) {
		// TODO Auto-generated method stub
		return new Program(functionList,main);
	}

	@Override
	public Function createFunctionDefinition(String functionName, Statement body, SourceLocation location) {
		return new Function(functionName, body, location);
	}

	@Override
	public Statement createAssignmentStatement(String variableName, Expression value, SourceLocation location) {
		return new AssignmentStatement(variableName, value, location);
	}

	@Override
	public Statement createWhileStatement(Expression condition, Statement body, SourceLocation location) {
		return new WhileStatement(condition, body, location);
	}

	@Override
	public Statement createBreakStatement(SourceLocation location) {
		return new BreakStatement(location);
	}

	@Override
	public Statement createReturnStatement(Expression value, SourceLocation location) {
		return new ReturnStatement(value, location);
	}
	
	@Override
	public Statement createIfStatement(Expression condition, Statement ifBody, Statement elseBody, SourceLocation location) {
		return new IfStatement(condition, ifBody, elseBody,location);
	}

	@Override
	public Statement createPrintStatement(Expression value, SourceLocation location) {
		return new PrintStatement(value, location);
	}

	@Override
	public Statement createSequenceStatement(List<Statement> statements, SourceLocation location) {
		return new SequenceStatement(statements, location);
	}

	@Override
	public Expression createReadVariableExpression(String variableName, SourceLocation location) {
		return new ReadVariableExpression(variableName, location);
	}

	@Override
	public Expression createReadParameterExpression(String parameterName, SourceLocation location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expression createFunctionCallExpression(String functionName, List<E> actualArgs, SourceLocation location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expression createChangeSignExpression(Expression e, SourceLocation location) {
		return new ChangeSignExpression(e, location);
;	}

	@Override
	public Expression createNotExpression(Expression e, SourceLocation location) {
		return new NotExpression(e, location);
	}

	@Override
	public Expression createDoubleLiteralExpression(double value, SourceLocation location) {
		return new DoubleLiteralExpression(value, location);
	}

	@Override
	public E createNullExpression(SourceLocation location) {
		return new NullExpression(location);
	}

	@Override
	public Expression createSelfExpression(SourceLocation location) {
		return new SelfExpression(location);
	}

	@Override
	public Expression createShipExpression(SourceLocation location) {
		return new ShipExpression(location);
	}

	@Override
	public Expression createAsteroidExpression(SourceLocation location) {
		return new AsteroidExpression(location);
	}

	@Override
	public Expression createPlanetoidExpression(SourceLocation location) {
		return new PlanetoidExpression(location);
	}

	@Override
	public Expression createBulletExpression(SourceLocation location) {
		return new BulletExpression(location);
	}

	@Override
	public Expression createPlanetExpression(SourceLocation location) {
		return new PlanetExpression(location);
	}

	@Override
	public Expression createAnyExpression(SourceLocation location) {
		return new AnyExpression(location);
	}

	@Override
	public Expression createGetXExpression(Expression e, SourceLocation location) {
		return new GetXExpression(e, location);
	}

	@Override
	public Expression createGetYExpression(Expression e, SourceLocation location) {
		return new GetYExpression(e,location);
	}

	@Override
	public Expression createGetVXExpression(Expression e, SourceLocation location) {
		return new GetVxExpression(e, location);
	}

	@Override
	public Expression createGetVYExpression(Expression e, SourceLocation location) {
		return new GetVyExpression(e, location);
	}

	@Override
	public Expression createGetRadiusExpression(Expression e, SourceLocation location) {
		return new GetRadiusExpression(e, location);
	}

	@Override
	public Expression createLessThanExpression(Expression e1, Expression e2, SourceLocation location) {
		return new LessThanExpression(e1, e2, location);
	}

	@Override
	public Expression createEqualityExpression(Expression e1, Expression e2, SourceLocation location) {
		return new EqualityExpression(e1, e2, location);
	}

	@Override
	public Expression createAdditionExpression(Expression e1, Expression e2, SourceLocation location) {
		return new AdditionExpression(e1,e2,location);
	}

	@Override
	public Expression createMultiplicationExpression(Expression e1, Expression e2, SourceLocation location) {
		return new MultiplicationExpression(e1, e2, location);
	}

	@Override
	public Expression createSqrtExpression(Expression e, SourceLocation location) {
		return new SqrtExpression(e, location);
	}

	@Override
	public Expression createGetDirectionExpression(SourceLocation location) {
		return new GetDirectionExpression(location);
	}

	@Override
	public Statement createThrustOnStatement(SourceLocation location) {
		return new ThrustOnStatement(location);
	}

	@Override
	public Statement createThrustOffStatement(SourceLocation location) {
		return new ThrustOffStatement(location);
	}

	@Override
	public Statement createFireStatement(SourceLocation location) {
		return new FireStatement(location);
	}

	@Override
	public Statement createTurnStatement(E angle, SourceLocation location) {
		return new TurnStatement(location, angle);
	}

	@Override
	public Statement createSkipStatement(SourceLocation location) {
		return new SkipStatement(location);
	}

}
