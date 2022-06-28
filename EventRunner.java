import java.util.Scanner;
import java.util.ArrayList;
import java.math.*;
public class EventRunner {
    private Deck deck;
    //The number of times the player has failed the king's test
    private int strikes;
    //timer
    public int weeksSurvived;
    //constructer
    public EventRunner(){
        this.deck = new Deck();;
        strikes = 0;
    }
    public String toString(){
        String holder = deck.toString();
        return holder;
    }
    public int run(){
        while (strikes < 3){
                kingTest();
                while(deck.hand.size() <5){
                    deck.draw();
                }
                /*
                while(deck.stack.size() > 0){
                    deck.draw();
                }
                */
                weeksSurvived++;
                if(weeksSurvived == 20){
                    //return 250;
                }
        }
        return weeksSurvived;
        
    }
    //Gives the player an opertunity to select a card (for events)
    public static Card select(Deck deck){
        Card selected = new MajorArcana("Filler", "You shouldn't be seeing this");
        Scanner input = new Scanner(System.in);
        while(selected.getVal() < 0){
            int holder = 1000;
            while(holder >= deck.hand.size()){
                System.out.println("");
                deck.printHand();
                if(deck.hand.size() == 0){
                    System.out.println("Out of options, you give up");
                    return(new Card(-1000, "Love"));
                }
                System.out.print("Invoke a fate: ");
                holder = input.nextInt() - 1; input.nextLine();
                if(holder >= deck.hand.size()){
                    System.out.print("Choose a valid card");
                }
                
            }
            selected = deck.hand.get(holder);
            if(selected.getVal() < 0){
                System.out.print("\nThe Fates Shudder\n");
            }
            selected.activate(deck, holder);
        }
        return selected;
    }
    //Decides if a card worked or didn't
    public boolean cardTest(int bar, Card chosen){
        int val = chosen.getVal();
        int diff = val - bar;
        double degree = 0;
        if(diff >= 0){
            degree = Math.pow(0.5, diff)/2.0;
        }
        else{
            degree = 1 - (Math.pow(0.5, -diff)/2.0);
        }
	System.out.println(degree + "%");
        if(Math.random() > degree){
            return true;
        }
        else{
            return false;
        }
    }
    public void kingTest(){
        System.out.println("A week passes and it's time to determine the next week's fate");
        Card chosen = select(deck);
        if(cardTest(8-1*strikes, chosen)){
            
            System.out.println("Success\n");
            System.out.println("The week goes well and you prosper");
        }
        else{
            strikes+=1;
            System.out.println("Failure\n");
            System.out.println("Catastrophe! Ruin strikes! Strikes: " + strikes);
            if(strikes<3){
                System.out.println("But you find something interesting amongst the rubble");
                Judgement.draft(deck); 
            }
            
        }
        
    }
}