public class Strength extends MajorArcana{
    public Strength(){
        super("Strength", "Something Borrowed");
    }
    //Makes the biggest card bigger
    @Override
    public void activate(Deck deck, int index){
        deck.discard(index);
        for (int i = 0; i < deck.hand.size(); i++){
            if(deck.hand.get(i).getVal() > 1){
                deck.hand.get(i).setVal(deck.hand.get(i).getVal() - 2);
            }
            deck.hand.get(0).setVal(deck.hand.get(0).getVal() + 2);
            
        }
        /*
        for (int i = 0; i < deck.hand.size(); i++){
            if(deck.hand.get(i).getVal() < 0){
                deck.hand.get(i).setVal(0);
            }
        }
        */
    }
}