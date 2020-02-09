package oOp.matchbox;

public class Matches {
    //Спичку представте тоже в виде обьекта с состоянием горит не горит.
    private boolean burn;

    public boolean isBurn() {
        return burn;
    }

    public void setBurn(boolean burn) {
        this.burn = burn;
    }


    public Matches(){
        setBurn(false);
    }

    public void burned(){
        setBurn(true);
    }
}