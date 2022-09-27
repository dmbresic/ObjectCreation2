public class Car {
    private Integer numOfWheels;
    private Integer numOfDoors;
    private String engineType;
    private String model;
    private String make;

    public Car(){

    }

    public Car(Integer numOfWheels, Integer numOfDoors, String engineType, String model) {
        this.numOfWheels = numOfWheels;
        this.numOfDoors = numOfDoors;
        this.engineType = engineType;
        this.model = model;
    }

    public Integer getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(Integer numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public Integer getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(Integer numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString(){
        return "The created vehicle has: { " + this.make +
                ": " + this.model+ " , "+
                this.engineType + " , " +
                this.numOfWheels + " wheels, " +
                this.numOfDoors + " doors }";
    }
}
