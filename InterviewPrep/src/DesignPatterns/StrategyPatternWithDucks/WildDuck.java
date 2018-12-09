package DesignPatterns.StrategyPatternWithDucks;

public class WildDuck extends Duck{
	
	public WildDuck(String name){
		super(name, new FlysNormal());
	}
}
