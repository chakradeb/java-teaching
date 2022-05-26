public class Main {
    public static void main(String[] args) {
        LivelyDuck a = new LivelyDuck("Donald", "red");
        RubberDuck b = new RubberDuck("Rosy");
        WoodenDuck c = new WoodenDuck("Joy");

        SwimmingPool pool = new SwimmingPool();
        pool.add(a);
        pool.add(b);
        pool.add(c);
        System.out.println(pool);
        pool.canFirstDuckFly();
        pool.remove(a);
        System.out.println(pool);
        pool.canFirstDuckFly();
    }
}
