public class RubberDuck extends Duck {
    RubberDuck(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println("Can't Fly");
    }

    @Override
    void makeSound() {
        System.out.println("Squeeze Squeeze");
    }
}
