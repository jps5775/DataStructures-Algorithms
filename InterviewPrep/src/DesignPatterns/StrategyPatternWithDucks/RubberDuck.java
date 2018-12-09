package DesignPatterns.StrategyPatternWithDucks;

public class RubberDuck extends Duck{
	
	public RubberDuck(String name){
		super(name, new CantFly());
	}
}
