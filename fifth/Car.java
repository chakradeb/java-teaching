public class Car extends Vehicle {
    private final FuelType fuelType;
    private final float fuelCapacity;
    private final float mileage;
    private float fuelPresent;

    Car(int wheels, float speed, Color color, FuelType fuelType, float capacity, float mileage) {
        super(wheels, speed, color);
        this.fuelType = fuelType;
        this.fuelCapacity = capacity;
        this.fuelPresent = 0;
        this.mileage = mileage;
    }

    public float getFuelPresent() {
        return fuelPresent;
    }

    public void addFuel(float quantity) {
        this.fuelPresent += quantity;
    }

    public float canCoverDistance() {
        return fuelPresent * mileage;
    }

    @Override
    public void drive(float distance) {
        if(canCoverDistance() >= distance) {
            this.fuelPresent -= distance / mileage;
            return;
        }
    }
}
