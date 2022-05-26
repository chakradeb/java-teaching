public abstract class Duck {
    protected String name;

    Duck(String name) {
        this.name = name;
    }

    public void canSwim() {
        System.out.println("Yes");
    }

    abstract void fly();

    abstract void makeSound();

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }
}
