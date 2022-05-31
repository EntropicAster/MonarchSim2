public class Chariot extends MajorArcana{
    public Chariot(){
        super("Chariot", "Veni Vidi Vici");
    }
    //Makes the biggest card bigger
    @Override
    public void activate(Deck deck, int index){
        int highIn = 0;
        for (int i = 1; i < deck.hand.size(); i++){
            if(deck.hand.get(i).getVal() > deck.hand.get(highIn).getVal()){
                highIn = i;
            }
        }
        deck.hand.get(highIn).setVal(deck.hand.get(highIn).getVal() + 6);
        deck.discard(index);
    }
}