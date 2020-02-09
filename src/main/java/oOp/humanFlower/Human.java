package oOp.humanFlower;

public class Human {
    Watercan watercan;
    private String name;
    private String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void takeWatercan(Watercan watercan){
        watercan.setWatercanInTheHand(true);
        this.watercan = watercan;

    }

}