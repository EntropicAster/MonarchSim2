import java.math.*;
public class Devil extends MajorArcana{
    public Devil(){
        super("Devil", "Depravity");
    }
    //Buffs hand and turns another card into a devil card.
    @Override
    public void activate(Deck deck, int index){
        deck.discard(index);
	for(int i = 0; i < deck.stack.size(); i++){
		if(!deck.stack.get(i).getName().equals("Devil")){
			deck.stack.remove(i);
                	deck.stack.add(i, new Devil());
			break;
		}
	}
/*
	for(int i = 0; i < deck.hand.size(); i++){
		if(!deck.hand.get(i).getName().equals("Devil")){
			deck.hand.remove(i);
                	deck.hand.add(i, new Devil());
			break;
		}
	}

        if(deck.hand.size()>0){
	    if(deck.hand.get(0).getName().equals("Devil")){
		if(deck.hand.size()>1){
			deck.hand.remove(1);
                	deck.hand.add(1, new Devil());
		}
	    }
	    if(deck.hand.size()>0){
            	deck.hand.remove(0);
            	deck.hand.add(0, new Devil());
	    }
        }
        else{
            System.out.println("\nAll was consumed");
        }
*/
        for (int i = 0; i < deck.hand.size(); i++){
            if(deck.hand.get(i).getVal() >= 0){
                deck.hand.get(i).setVal(deck.hand.get(i).getVal() + 4);
            }
        }
    }
}