import java.math.*;
import java.util.Scanner;
import java.util.ArrayList;
public class HangedMan extends MajorArcana{
    public HangedMan(){
        super("Hanged Man", "It's vision may overwhelm");
    }
    //Lets the player draw one of the top 5 cards
    @Override
    public void activate(Deck deck, int index){
        Scanner in = new Scanner(System.in);
        System.out.println("");
        ArrayList<Card> holder = new ArrayList<Card>();
        for(int i = 0; i < 5; i++){
	    if(deck.stack.size()>0){
        	holder.add(deck.stack.remove(0));
	    }
	    else{
		holder.add(new Card(1, "Emptiness"));
	    }
        }
        Deck.cardList(holder);
        System.out.print("Grasp a fate: ");
        int num = 10000;
        while(num > holder.size()){
            num = in.nextInt() - 1;
            if(num > holder.size()){
                System.out.print("Choose a valid fate");
            }
        }
        deck.hand.add(holder.remove(num));
        for(int i = 0; i < 4; i++){
            deck.stack.add(holder.remove(0));
        }
        deck.discard(index);
    }
}