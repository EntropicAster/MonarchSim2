import java.util.ArrayList;
public class Card {
    private int value;
    private String suite;
    
    public Card (int value, String suite){
        this.value = value;
        this.suite = suite;
    }
    
    public String toString(){
        String cat = value + " of " + suite ;
        if(suite.equals("Coins")){
            if(value < 10){
                cat += "      (-Swords)";
            }
            else{
                cat += "     (-Swords)";
            }
        }
        else if(suite.equals("Cups")){
            if(value < 10){
                cat += "       (-Wands)";
            }
            else{
                cat += "      (-Wands)";
            }
        }
        else if (suite.equals("Swords")){
            if(value < 10){
                cat += "     (-Cups)";
            }
            else{
                cat += "    (-Cups)";
            }
        }
        else if (suite.equals("Wands")){
            if(value < 10){
                cat += "      (-Coins)";
            }
            else{
                cat += "     (-Coins)";
            }
            
        }
        return  cat;
    }
    //getters and setters
    public int getVal(){
        return value;
    }
    public void setVal(int value){
        this.value = value;
    }
    public String getSuite(){
        return suite;
    }
    public void setSuite(String suite){
        this.suite = suite;
    }
    public String getName(){
        return "";
    }
    //subclasses need an activate keyword.
    public void activate(Deck deck, int index){
        if(suite.equals("Coins")){
            deck.cut("Swords", 1);
        }
        else if (suite.equals("Cups")){
            deck.cut("Wands", 1);
        }
        else if(suite.equals("Swords")){
            deck.cut("Cups", 1);
        }
        else if(suite.equals("Wands")){
            deck.cut("Coins", 1);
        }
	else if(suite.equals("Growth")){
	    value*=2;
	}
        deck.discard(index);
    }
}