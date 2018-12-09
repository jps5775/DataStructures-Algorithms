package DesignPatterns.StrategyPatternWithDucks;

public class Duck {
	
	protected String name;
	protected Flyable flyType;
	
	public Duck(String name, Flyable flyType){
		this.name = name;
		this.flyType = flyType;
	}

	public void quack(){
		System.out.println("Quack Quack!");
	}
	
	public String displayName(){
		return this.name;
	}
	
	// This method is the problem method
	// This method has many different types
	public String fly(){
		return flyType.fly();
	}
	
	public static void main(String[] args){
		Duck duck1 = new CityDuck("George");
		Duck duck2 = new WildDuck("Adam");
		Duck duck3 = new RubberDuck("Angela");
		Duck duck4 = new MountainDuck("Joe");
		Duck duck5 = new CloudDuck("John");
		
		System.out.println(duck1.fly());
		System.out.println(duck2.fly());
		System.out.println(duck3.fly());
		System.out.println(duck4.fly());
		System.out.println(duck5.fly());
		
	}
	
}
