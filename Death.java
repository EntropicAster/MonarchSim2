import java.math.*;
public class Death extends MajorArcana{
    public Death(){
        super("Death", "Something Blue");
    }
    //Randomize the value of your lowest card
    @Override
    public void activate(Deck deck, int index){
        deck.discard(index);
        int lowIn = 0;
        for (int i = 1; i < deck.hand.size(); i++){
            if(deck.hand.get(lowIn).getVal() < 0 || (deck.hand.get(i).getVal() < deck.hand.get(lowIn).getVal() && deck.hand.get(i).getVal() >= 0)){
                lowIn = i;
            }
        }
        deck.hand.remove(lowIn);
        deck.draw();
    }
}