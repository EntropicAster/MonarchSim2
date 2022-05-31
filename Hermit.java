import java.math.*;
public class Hermit extends MajorArcana{
    public Hermit(){
        super("Hermit", "Something old");
    }
    // Draws a 7, 8, and 9 (if able) from the deck.
    @Override
    public void activate(Deck deck, int index){
        
        for(int i = 0; i < deck.stack.size(); i++){
            if(deck.stack.get(i).getVal() == 7){
                deck.hand.add(deck.stack.remove(i));
                break;
            }
        }
        for(int i = 0; i < deck.stack.size(); i++){
            if(deck.stack.get(i).getVal() == 8){
                deck.hand.add(deck.stack.remove(i));
                break;
            }
        }
        for(int i = 0; i < deck.stack.size(); i++){
            if(deck.stack.get(i).getVal() == 9){
                deck.hand.add(deck.stack.remove(i));
                break;
            }
        }
        deck.discard(index);
    }
}