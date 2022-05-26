public class ThreeFraction {
    private int first;
    private int second;
    private int last;

    ThreeFraction(int first, int second, int last) {
        this.first = first;
        this.second = second;
        this.last = last;
    }

    @Override
    public String toString() {
        return first + "." + second + "." + last;
    }

    public ThreeFraction add(ThreeFraction other) {
        return new ThreeFraction(
                this.first + other.first,
                this.second + other.second,
                this.last + other.last
        );
    }

    public ThreeFraction minus(ThreeFraction other) {
        return new ThreeFraction(
                this.first - other.first,
                this.second - other.second,
                this.last - other.last
        );
    }
}
