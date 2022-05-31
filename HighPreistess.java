import java.math.*;
public class HighPreistess extends MajorArcana{
    public HighPreistess(){
        super("High Priestesses", "One was not known");
    }
    //Randomize the value of your lowest card
    @Override
    public void activate(Deck deck, int index){
        deck.discard(index);
        int lowIn = 0;
        for (int i = 1; i < deck.hand.size(); i++){
            if(deck.hand.get(lowIn).getVal() == 0 || (deck.hand.get(i).getVal() < deck.hand.get(lowIn).getVal() && deck.hand.get(i).getVal() != 0)){
                lowIn = i;
            }
        }
        deck.hand.get(lowIn).setVal(1 + (int)(Math.random()*14));
    }
}