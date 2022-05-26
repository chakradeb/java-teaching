public class WoodenDuck extends Duck {
    WoodenDuck(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println("Can't Fly");
    }

    @Override
    void makeSound() {}
}
