import java.math.*;
public class Art extends MajorArcana{
    public Art(){
        super("Art", "Alchemy");
    }
    //Turns lead to gold
    @Override
    public void activate(Deck deck, int index){
        
        boolean found = false;
        for (int i =0; i < deck.hand.size(); i++){
            if((deck.hand.get(i).getVal() == 1)){
                deck.hand.get(i).setVal(14);
                found = true;
            }
        }
        if(!found){
            System.out.println("But they do not Shift");
        }
        else{
            deck.discard(index);
        }
    }
}