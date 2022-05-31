import java.math.*;
public class WheelofFortune extends MajorArcana{
    public WheelofFortune(){
        super("Wheel of Fortune", "Banned in Legacy");
    }
    //Draws the player a new hand
    @Override
    public void activate(Deck deck, int index){
        for(int i = deck.hand.size()-1; i > 0; i--){
            if(deck.hand.get(i).getVal() > 1){
                deck.hand.get(i).setVal(deck.hand.get(i).getVal());
            }
            deck.discard(0);
        }
        deck.shuffle();
        for(int i =0; i < 5; i++){
            deck.draw();
        }
    }
}