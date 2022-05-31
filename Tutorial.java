import java.util.Scanner;
public class Tutorial {
    private Deck tutorialDeck;
    //Explains how to play the game
    public Tutorial(){
        tutorialDeck = new Deck();
        Scanner in = new Scanner(System.in);
        System.out.println("In this game you have a deck of cards");
        System.out.println("They are valued 1-14, and randomly one of four suites");
        System.out.print("Take this as an example: ");
        System.out.println(new Card(7, "Swords"));
        System.out.println("");
        System.out.println("These fourteen cards are divided into two zones");
        System.out.println("Five in your hand and nine in your stack");
        System.out.println("Your hand will look like this: ");
        while(tutorialDeck.hand.size()>0){
            tutorialDeck.discard(0);
        }
        tutorialDeck.hand.add(new Card(12, "Swords"));
        tutorialDeck.hand.add(new Card(8, "Cups"));
        tutorialDeck.hand.add(new Card(8, "Cups"));
        tutorialDeck.hand.add(new Card(11, "Wands"));
        tutorialDeck.hand.add(new Card(7, "Swords"));
        tutorialDeck.stack.add(0, new Card(7, "Wands"));
        tutorialDeck.printHand();
        System.out.print("(They're called fates because I'm a dramatic Fae Being)\n");
        System.out.print("Now choose a card to play!");
        EventRunner.select(tutorialDeck);
        System.out.println("Failure");
        System.out.println("What was that? Why did it say \"Failure\""); in.nextLine();
        System.out.println("Oh, your card wasn't good enough!");
        System.out.println("Each card is attached to a chance to fail!");
        System.out.println("Playing a 7 now would give you 50% chance to Fail.");
        System.out.println("A six give 3/4, a five gives 7/8 and so on.");
        System.out.println("Fail three times and you DIE!"); in.nextLine();
        System.out.println("jk, you just lose the card game");
        System.out.println("But that other thing is also important");
        System.out.println("\"Power Wanes\"");
        System.out.println("Powerful Wands Make a Coins card in you hand weaker");
        System.out.println("Powerful Coins Make a Swords card in you hand weaker");
        System.out.println("Powerful Swords Make a Cups card in you hand weaker");
        System.out.println("Powerful Cups Make a Wands card in you hand weaker");
        System.out.println("Are you having fun?");in.nextLine();
        System.out.println("Then you'd like to play it for the rest of your life!");
    }
}