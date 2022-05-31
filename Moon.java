import java.math.*;
public class Moon extends MajorArcana{
    public Moon(){
        super("Moon", "Darkness");
    }
    //Adds a bad card to the top of the deck
    @Override
    public void activate(Deck deck, int index){
        deck.discard(index);
        deck.stack.add(0, new Card(1, "Blindness"));
        deck.stack.add(1, new Card(15, "Sight"));
    }
}