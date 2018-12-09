package DesignPatterns.StrategyPatternWithDucks;

public class CloudDuck extends Duck{
	
	public CloudDuck(String name){
		super(name, new FlysHigh());
	}
}
