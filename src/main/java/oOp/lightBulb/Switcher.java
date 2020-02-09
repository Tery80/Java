package oOp.lightBulb;

public class Switcher {
    LightBulb bulb;

    void connectBulb(LightBulb bulb){
        this.bulb = bulb;
    }

    void switchOn(){
        bulb.switchLightOn(bulb);
    }
    void switchOff (){
        bulb.switchLightOff(bulb);
    }
}