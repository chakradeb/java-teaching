public class LivelyDuck extends Duck {

    private String color;

    LivelyDuck(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    void fly() {
        System.out.println("Can Fly");
    }

    @Override
    void makeSound() {
        System.out.println("Quack Quack");
    }

    @Override
    public String toString() {
        return "{" +
                "name ='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
