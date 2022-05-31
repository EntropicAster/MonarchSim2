import java.util.Scanner;
import java.util.ArrayList;

public class AARunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Creates the deck used for decision making
        System.out.println("~Do You Want to Play a Game?~\n");
        if(input.nextLine().indexOf("y")>-1){
            System.out.println("\n");
            Tutorial go = new Tutorial();
        }
        System.out.println("Then be cursed! Your doom is tied to this deck of cards!\n");
        while(true){
            EventRunner game = new EventRunner();
            System.out.println("You survived " + game.run() + " weeks!");
            System.out.println(game);
	    System.out.println();
            System.out.println("Do you want to play again?");
            System.out.println("1) Yes\n2) No");
            if(input.nextLine().indexOf("1") == -1){
                break;
            }
        }
    }
}