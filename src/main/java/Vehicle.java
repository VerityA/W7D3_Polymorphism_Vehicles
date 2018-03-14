public abstract class Vehicle implements IDrivable {

    private int averageSpeed;


    public Vehicle(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }


}
