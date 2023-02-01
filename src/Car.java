public class Car {
    private String model;
    private int miles;

    public Car(String m, int mi) {
        model = m;
        miles = mi;
    }

    public String toString() {
        return model + " " + miles + "mi";
    }
}
