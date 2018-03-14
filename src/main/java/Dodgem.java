public class Dodgem extends Vehicle{

    private int numberOfSeats;
    private int averageSpeed;

    public Dodgem(int averageSpeed, int numberOfSeats) {
        super(averageSpeed);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public int driveTimeToTravelDistance(int distance) {
        return distance / averageSpeed;
    }
}
