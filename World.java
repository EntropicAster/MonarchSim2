import java.util.Scanner;
public class World extends MajorArcana{
    public World(){
        super("World", "Something new");
    }
    //Replaces the deck with a new copy.
    @Override
    public void activate(Deck deck, int index){
        deck.discard(index);
        while (deck.stack.size() > 0){
            deck.stack.remove(0);
        }
        String[] suites = {"Wands", "Cups", "Swords", "Coins"};
        for(int i=1; i<15; i++){
            deck.stack.add(new Card(i, suites[(int)(Math.random()*4)]));
            deck.shuffle();
        }
    }
}