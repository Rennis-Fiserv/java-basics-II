import java.util.ArrayList;
public class Main{

    public static void main(String[] args){

        var animals = new ArrayList<Animal>();

        var dog = new Dog();

        var snake = new Snake();

        var tiger = new Tiger();

        animals.add(dog);

        animals.add(snake);

        animals.add(tiger);

        for(Animal a : animals){
            System.out.println(a.noise());
        }

    }
}