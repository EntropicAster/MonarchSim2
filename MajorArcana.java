import java.util.ArrayList;
public class MajorArcana extends Card{
    //Template for the Major Arcana.
    //Would be an interface but as a superclass it can simplfy some methods
    
    public String name;
    private String description;
    public MajorArcana(String name, String desc){
        super(-1, "high");
        this.name = name;
        description = desc;
    }
    //Method to be Overriden by subclasses
    public void activate(Deck deck, int index){}
    //returns the description
    //Unused
    public String esc(){
        return description;
    }
    //returns the cards name (used for synergy cards)
    public String getName(){
        return name;
    }
    //toString gives a vague description
    @Override
    public String toString(){
        return "The mighty " + name + "    ~" + description + "~";
    }
}