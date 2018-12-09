package CTCI.Chapter_7_OOD;

public class CardGame {

    // Factory Method Design Pattern
    //      -offers interface for creating instance of a class, with its
    //          subclasses deciding which class to instantiate.
    //      -used when a method must return several possible objects that
    //          that share a common super class

    public static CardGame createCardGame(GameType type){
        if(type == GameType.Poker){
            return new PokerGame();
        }else if(type == GameType.BlackJackGame){
            return new BlackJackGame();
        }
        return null;
    }


}

enum GameType{
    Poker,
    BlackJackGame
}

class PokerGame extends CardGame{}

class BlackJackGame extends CardGame{}
