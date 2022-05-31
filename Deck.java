import java.util.ArrayList;
import java.math.*;
public class Deck {
    //cards in stack
    public ArrayList<Card> stack = new ArrayList<Card>();
    //cards able to be played
    public ArrayList<Card> hand = new ArrayList<Card>();
    //The Major Arcana
    public ArrayList<Card> MA = new ArrayList<Card>();
    //constructer
    public Deck(){
        String[] suites = {"Wands", "Cups", "Swords", "Coins"};
        for(int i=1; i<15; i++){
            stack.add(new Card(i, suites[(int)(Math.random()*4)]));
        }
        //for(int i=1; i<15; i++){
        //    stack.add(new Card(i, "Cups"));
        //}
        //for(int i=1; i<15; i++){
        //    stack.add(new Card(i, "Swords"));
        //}
        //for(int i=1; i<15; i++){
        //    stack.add(new Card(i, "Coins"));
        //}
        shuffle();
        for(int i=0; i<5; i++){
            draw();
        }
        MA.add(new Fool());
        MA.add(new Hermit());
        MA.add(new WheelofFortune());
        MA.add(new HangedMan());
        MA.add(new Lovers());
        MA.add(new Chariot());
        MA.add(new Star());
        MA.add(new Sun());
        MA.add(new Magus());
        MA.add(new HighPreistess());
        MA.add(new Judgement());
        MA.add(new Justice());
        MA.add(new Strength());
        MA.add(new Death());
        MA.add(new Hierophant());
        MA.add(new World());
        MA.add(new Tower());
        MA.add(new Art());
        MA.add(new Moon());
        MA.add(new Devil());
        MA.add(new Emperor());
        MA.add(new Empress());
        //hand.add(new Empress());
        //hand.add(new Emperor());
        //hand.add(new WheelofFortune());
    }
    //Prints hand for select method
    public void printHand(){
        System.out.println("Your fates are:");
        Deck.cardList(hand);
    }
    //Prints all the cards in a list for a number of methods
    public static void cardList(ArrayList<Card> toPrint){
        for(int i = 0; i<toPrint.size(); i++){
            System.out.println((i+1)+") "+ toPrint.get(i));
        }
        System.out.println("");
    }
    //moves a card from the stack to the hand
    public void draw(){
	hand.add(stack.remove(0));
	if(stack.size()==0){
		hand.add(new Card(1, "Emptiness"));
		System.out.println("You feel hollow");
	}
    }
    //randomizes the stack
    public void shuffle(){
        for(int i = 0; i<stack.size(); i++){
            stack.add(0, stack.remove((int)(i+Math.random()*(stack.size()-i))));
        }
    }
    
    public String toString(){
        String concat = "\nHand:";
        for(Card print: hand){
            concat = concat + "\n" + print;
        }
        concat= concat + "\n\nDeck:";
        for(Card print: stack){
            concat = concat + "\n" + print;
        }
        return concat;
    }
    //moves a card from the hand to the stack
    public void discard(int index){
        if(hand.get(index).getSuite().equals("Dominion") && Emperor.debt > 0){
            hand.remove(index);
            Emperor.debt--;
        }
        else{
            stack.add(hand.remove(index));
        }
    }
    public void cut(String ste, int in){
        boolean has = false;
        for(int i=0; i< hand.size(); i++){
            if(!has && hand.get(i).getSuite().equals(ste)){
                hand.get(i).setVal(hand.get(i).getVal()-in);
                has = true;
                System.out.println("Power Wanes\n");
            }
        }
    }
    
}