package DesignPatterns.StrategyPatternWithDucks;

public class MountainDuck extends Duck{
	
	public MountainDuck(String name) {
		super(name, new FlysHigh());
	}


}
