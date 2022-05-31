import java.math.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Judgement extends MajorArcana{
    public Judgement(){
        super("Judgement", "Rebirth");
    }
    //Replaces itself with one of 3 Major Arcana
    @Override
    public void activate(Deck deck, int index){
        draft(deck);
        deck.hand.remove(index);
    }
    //Method that adds MA to the deck
    public static void draft(Deck deck){
        Scanner in = new Scanner(System.in);
        System.out.println("\nThree peculiar cards stand before you");
        ArrayList<Card> options = new ArrayList<Card>();
        for(int i = 0; i<3; i++){
            options.add(deck.MA.get((int)(Math.random()*deck.MA.size())));
        }
        deck.cardList(options);
        System.out.print("Grasp a fate: ");
        int num = 10000;
        while(num > options.size()){
            num = in.nextInt() - 1;
            if(num > options.size()){
                System.out.print("Choose a valid fate");
            }
        }
        deck.hand.add(options.get(num));
        //deck.stack.add(options.get(num));
        //deck.stack.add(options.get(num));
        //deck.stack.add(options.get(num));
        deck.shuffle();
    }
}