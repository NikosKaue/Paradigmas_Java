package guilda;

public class Mago extends Person {

    private int MagicPoints;
    private int MaxMagicPoints;
    
    public int getMagicPoints() {
        return MagicPoints;
    }

    public void setMagicPoints(int MagicPoints) {
        this.MagicPoints = MagicPoints;
    }

    public int getMaxMagicPoints() {
        return MaxMagicPoints;
    }

    public void setMaxMagicPoints(int MaxMagicPoints) {
        this.MaxMagicPoints = MaxMagicPoints;
    }
}
