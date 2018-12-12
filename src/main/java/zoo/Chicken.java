package zoo;

import Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "qk qk qk";
    }
    public String howtoEat(){
        return "ngon qua:";
    }
}
