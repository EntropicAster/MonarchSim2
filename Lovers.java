import java.math.*;
public class Lovers extends MajorArcana{
    public Lovers(){
        super("Lovers", "Till death do they part");
    }
    //Merges 2 cards
    //making them have the "Love" suite means they won't hurt other cards 
    //for being such a large card
    @Override
    public void activate(Deck deck, int index){
        deck.discard(index);
        int power = deck.hand.remove((int)(deck.hand.size()*Math.random())).getVal();
        power += deck.hand.remove((int)(deck.hand.size()*Math.random())).getVal();
        deck.hand.add(new Card(power, "Love"));
    }
}