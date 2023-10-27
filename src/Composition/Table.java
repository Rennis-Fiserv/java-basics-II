import java.util.ArrayList;

public class Table implements Billable{

    private Integer width;
    private Integer length;
    private ArrayList<Leg> legs = new ArrayList<>();

    public Table(Integer numLegs, Integer width, Integer length) {
        this.width = width;
        this.length = length;
         for(int i = 0; i < numLegs; i++) {
             legs.add(new Leg(25));
        }
    }

    Float getPrice(){

        return this.width*this.length*1.00;

    }
}