abstract class Obrazce {
    private int stranaA;


    public Obrazce(int stranaA ) {
        this.stranaA = stranaA;
    }

    public abstract void dataCollect();

    public abstract void obvod();

    public int getStranaA() {
        return stranaA;
    }

    public void setStranaA(int stranaA) {
        this.stranaA = stranaA;
    }

    public abstract void obsah();
}
