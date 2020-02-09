package oOp.lightBulb;

public class LightMain {
    public static void main(String[] args) {
        int SWITCH_ON_COUNT = 5;
        LightBulb bulb = new LightBulb("Philips", SWITCH_ON_COUNT);
        Switcher switcher = new Switcher();
        switcher.connectBulb(bulb);
        for (int i = 0; i < SWITCH_ON_COUNT;i++ ) {
            switcher.switchOff();
            switcher.switchOn();
        }
        switcher.switchOn();
    }
}