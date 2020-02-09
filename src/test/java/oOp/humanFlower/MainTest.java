package oOp.humanFlower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    //    1. только созданый цветок не полит
//2. human without watercan can't water flower
//            3. human with watercan can water flower
    @Test
    public void justCreatedFlowerIsNotWatered() {
        Flower flower = new Flower();
        assertFalse(flower.isWatered());
    }

    @Test
    public void humanNoWatercanCantWaterFlower() { // if watercan isn't in the hand, so watwatercanInTheHand = false
        Watercan watercan = new Watercan();
        assertFalse(watercan.isWatercanInTheHand());
    }

    @Test
    public void flowerIsWatered() {
        Flower flower = new Flower(); // statuss for flower false
        Watercan watercan = new Watercan(); // statuss is not taken
        Human human = new Human();
        human.takeWatercan(watercan); // human takes watercan , so watercanInTheHand became true
        if (watercan.isWatercanInTheHand()) {
            flower.setWatered(true); // human waters flower , so flower is watered
        }
        assertTrue(watercan.isWatercanInTheHand() && flower.isWatered());
    }
}