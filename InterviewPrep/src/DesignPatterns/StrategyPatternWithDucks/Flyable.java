package DesignPatterns.StrategyPatternWithDucks;

public interface Flyable {
	String fly();
}

class CantFly implements Flyable{
	
	public String fly(){
		return "Can't fly!";
	}
	
}

class FlysHigh implements Flyable{
	
	public String fly(){
		return "Flying super High!";
	}
}

class FlysNormal implements Flyable{
	
	public String fly(){
		return "Flying normal";
	}
}
