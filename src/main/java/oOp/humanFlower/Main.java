package oOp.humanFlower;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        Flower flower = new Flower(); // statuss for flower false
        Watercan watercan = new Watercan(); // statuss is not taken

        human.takeWatercan(watercan);

        if (watercan.isWatercanInTheHand()){
            flower.setWatered(true); // human waters flower , so flower is watered
        }

    }
}