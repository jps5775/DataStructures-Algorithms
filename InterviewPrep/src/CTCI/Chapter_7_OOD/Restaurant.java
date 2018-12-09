package CTCI.Chapter_7_OOD;

public class Restaurant {

    // Singleton Design Pattern

    private static Restaurant instance = null;

    private Restaurant(){}

    public static Restaurant getInstance(){
        if(instance == null){
            instance = new Restaurant();
        }

        return instance;
    }

}
