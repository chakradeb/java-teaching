import java.util.ArrayList;

public class SwimmingPool {
    private ArrayList<Duck> ducks;

    SwimmingPool() {
        this.ducks = new ArrayList<>();
    }

    public void add(Duck duck) {
        this.ducks.add(duck);
    }

    public void remove(Duck duck) {
        this.ducks.remove(duck);
    }

    public void canFirstDuckFly() {
        this.ducks.get(0).fly();
    }

    @Override
    public String toString() {
        return "SwimmingPool{" +
                "ducks=" + ducks +
                '}';
    }
}


// 6 - Int

// [6, 7] - Int[]

