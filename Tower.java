public class Tower extends MajorArcana{
    public Tower(){
        super("Tower", "Doom");
    }
    //Makes the hand weaker
    @Override
    public void activate(Deck deck, int index){
        deck.hand.remove(index);
        deck.stack.add(new Death());
        deck.stack.add(new Death());
        deck.stack.add(new Death());
        for (int i = 0; i < deck.hand.size(); i++){
            if(deck.hand.get(i).getVal() > -1){
                deck.hand.get(i).setVal(deck.hand.get(i).getVal() - 5);
            }
        }

    }
}