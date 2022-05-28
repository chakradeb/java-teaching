public class Main {
    public static void main(String[] args) {
        Car bmw = new Car(4, 123, Color.WHITE, FuelType.PETROL, 47, 24.5f);
        bmw.addFuel(1);
        System.out.println(bmw.getFuelPresent());
        bmw.drive(24);
        System.out.println(bmw.getFuelPresent());
        System.out.println(bmw.canCoverDistance());
        bmw.drive(0.49999976f);
        System.out.println(bmw.getFuelPresent());
    }
}
