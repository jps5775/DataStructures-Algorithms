package DesignPatterns.StrategyPatternWithDucks;

public class CityDuck extends Duck{

	public CityDuck(String name) {
		super(name, new FlysNormal());
	}

}
