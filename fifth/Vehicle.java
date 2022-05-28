public abstract class Vehicle {
    private final int wheels;
    private final float topSpeed;
    private final Color color;

    Vehicle(int wheels, float speed, Color color) {
        this.wheels = wheels;
        this.topSpeed = speed;
        this.color = color;
    }

    public abstract void drive(float distance);
}
