import java.math.*;
public class Star extends MajorArcana{
    public Star(){
        super("Star", "It leads the way");
    }
    //makes the next card bigger
    @Override
    public void activate(Deck deck, int index){
        if(deck.stack.get(0).getVal() >= 0){
                deck.stack.get(0).setVal(deck.stack.get(0).getVal() + 6);
        }
        deck.discard(index);
    }
}