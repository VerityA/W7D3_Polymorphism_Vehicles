public class Driver {

    private String name;
    private IDrivable vehicle;

    Driver(String name, IDrivable vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public int timeTakenToDriveDistance(int distance) {
       return this.vehicle.driveTimeToTravelDistance(distance);
    }

    public IDrivable getVehicle() {
        return vehicle;
    }


    public void setVehicle(IDrivable vehicle) {
        this.vehicle = vehicle;
    }
}
