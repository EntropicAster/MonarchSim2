import java.math.*;
public class Sun extends MajorArcana{
    public Sun(){
        super("Sun", "Pairs Ascendant");
    }
    //Upgrades a pair 
    @Override
    public void activate(Deck deck, int index){
        boolean hasPair = false;
        for(int i = 0; hasPair == false && i < deck.hand.size(); i++){
            for(int j = i+1; hasPair == false && j < deck.hand.size() ; j++){
                if(deck.hand.get(i).getVal() == deck.hand.get(j).getVal() && deck.hand.get(j).getVal() >= 0){
                    deck.hand.get(i).setVal(deck.hand.get(i).getVal() + 8);
                    deck.hand.get(j).setVal(deck.hand.get(j).getVal() + 8);
                    hasPair = true;
                }
            }
        }
        if(hasPair == true){
            deck.discard(index);
        }
        else{
            System.out.println("But they do not Shift");
        }
    }
}