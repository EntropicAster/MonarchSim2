import java.math.*;
public class Fool extends MajorArcana{
    public Fool(){
        super("Fool", "Made of Nothing");
    }
    //Adds a random 7 to the player's hand
    @Override
    public void activate(Deck deck, int index){
        int holder = (int)(Math.random()*4);
        if(holder > 2){
            deck.hand.add(new Card(7, "Cups"));
        }
        else if(holder > 1){
            deck.hand.add(new Card(7, "Swords"));
        }
        else if (holder > 0){
            deck.hand.add(new Card(7, "Wands"));
        }
        else{
            deck.hand.add(new Card(7, "Coins"));
        }
        deck.discard(index);
    }
}