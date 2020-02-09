package oOp.lightBulb;

public class LightBulb {
    //У лампочки должны быть такие свойства как: включена/выключена, фирма произовидеть, количество возможных включений(по умолчанию лампочку можно включить не более 5 раз).
    //Лампочка должна уметь включаться и выключаться.
    private boolean light;
    private String producedBy;
    private int switchOnCount;

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    public String getProducedBy() {
        return producedBy;
    }

    public void setProducedBy(String producedBy) {
        this.producedBy = producedBy;
    }

    public int getSwitchOnCount() {
        return switchOnCount;
    }

    public void setSwitchOnCount(int switchOnCount) {
        this.switchOnCount = switchOnCount;
    }

    public LightBulb(String producedBy, int switchOnCount){
        this.light = false;
        this.producedBy = producedBy;
        this.switchOnCount = switchOnCount;
    }

    public void switchLightOn(LightBulb bulb){
        if (switchOnCount > 0 ){
            if (!light){
                light = true;
                System.out.println("Light is On!");
                switchOnCount --;
            } else{
                System.out.println("Sorry! Light is already on!");
            }
        }else{
            System.out.println("Sorry! Bulb is broken");
        }
    }
    public void switchLightOff(LightBulb bulb){
        if (light){
            light = false;
            System.out.println("Light is Off!");
        } else{
            System.out.println("Light is already off!");
        }
    }

}