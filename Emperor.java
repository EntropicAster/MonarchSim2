import java.math.*;
public class Emperor extends MajorArcana{
    public static int debt = 0;
    public Emperor(){
        super("Emperor", "Power, for a Moment");
    }
    //Adds a card that will be removed to the hand
    @Override
    public void activate(Deck deck, int index){
        deck.discard(index);
        deck.hand.add(new Card(40, "Dominion"));
        boolean found = false;
        for(int i = 0; i < deck.hand.size(); i++){
            if(deck.hand.get(i).getName().equals("Empress")){
                found = true;
            }
        }
        if(!found){
            Emperor.debt++;
        }
        
    }
}