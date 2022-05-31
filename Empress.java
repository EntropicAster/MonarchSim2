import java.math.*;
public class Empress extends MajorArcana{
    public Empress(){
        super("Empress", "Power, in a Moment");
    }
    //Adds a lot of good cards to the bottom of the deck
    @Override
    public void activate(Deck deck, int index){
        deck.discard(index);
        
/*
        deck.stack.add(new Card(10, "Dominion"));
        deck.stack.add(new Card(10, "Dominion"));
*/
        boolean found = false;
        for(int i = 0; i < deck.hand.size(); i++){
            if(deck.hand.get(i).getName().equals("Emperor")){
                found = true;
            }
        }
        if(!found){
            deck.stack.add(1, new Card(5, "Growth"));
        }
	else{
	    deck.stack.add(1, new Card(15, "Growth"));
	}
    }
}