public class Justice extends MajorArcana{
    public Justice(){
        super("Justice", "All will be equal");
    }
    //Makes the biggest card bigger
    //At the cost of the other cards
    @Override
    public void activate(Deck deck, int index){
        deck.discard(index);
        int holder = 0;
        for (int i = 0; i < deck.hand.size(); i++){
            holder += deck.hand.get(i).getVal();
        }
        holder /= deck.hand.size();
        holder += 2;
        for (int i = 0; i < deck.hand.size(); i++){
            deck.hand.get(i).setVal(holder);
        }
    }
}