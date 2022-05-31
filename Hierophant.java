import java.math.*;
public class Hierophant extends MajorArcana{
    public Hierophant(){
        super("Hierophant", "ZeZe");
    }
    //makes the next into a MA.
    @Override
    public void activate(Deck deck, int index){
        deck.stack.remove(0);
        deck.stack.add(0, deck.MA.get((int)(Math.random()*deck.MA.size())));
        deck.discard(index);
    }
    @Override
    public String toString(){
        int randInt = (int)(Math.random()*6);
        if(randInt < 1 && Math.random()<0.1){
            return "The mighty " + super.name + "    ~Fuck the Gods~";
        }
        else if(randInt < 3){
            return "The mighty " + super.name + "    ~Behold, all ye with Eyes~";
        }
        else if(randInt < 5){
            return "The mighty " + super.name + "    ~For I have made a god of Clay~";
        }
        if(randInt < 6){
            return "The mighty " + super.name + "    ~And it is an idol of Wrath~";
        }
        return "ZeZe";
    }
}