public class Magus extends MajorArcana{
    public Magus(){
        super("Magus", "Panologist");
    }
    //Gives a buff to a card of each type
    @Override
    public void activate(Deck deck, int index){
        boolean found = false;
        for (int i = 0; !found && i < deck.hand.size(); i++){
            if(deck.hand.get(i).getSuite().equals("Cups")){
                if(deck.hand.get(i).getVal() >= 0){
                    deck.hand.get(i).setVal(deck.hand.get(i).getVal() + 4);
                }
                found = true;
            }
        }
        found = false;
        for (int i = 0; !found && i < deck.hand.size(); i++){
            if(deck.hand.get(i).getSuite().equals("Swords")){
                if(deck.hand.get(i).getVal() >= 0){
                    deck.hand.get(i).setVal(deck.hand.get(i).getVal() + 4);
                }
                found = true;
            }
        }
        found = false;
        for (int i = 0; !found && i < deck.hand.size(); i++){
            if(deck.hand.get(i).getSuite().equals("Coins")){
                if(deck.hand.get(i).getVal() >= 0){
                    deck.hand.get(i).setVal(deck.hand.get(i).getVal() + 4);
                }
                found = true;
            }
        }
        found = false;
        for (int i = 0; !found && i < deck.hand.size(); i++){
            if(deck.hand.get(i).getSuite().equals("Wands")){
                if(deck.hand.get(i).getVal() >= 0){
                    deck.hand.get(i).setVal(deck.hand.get(i).getVal() + 4);
                }
                found = true;
            }
        }
        deck.discard(index);
    }
}