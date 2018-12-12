import zoo.Animal;
import zoo.Chicken;
import zoo.Tiger;

public class checkZoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();

        for (Animal pet : animals ) {
            System.out.print(pet.makeSound());

        }
    }
}
