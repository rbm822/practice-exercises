package CMIS242Week1;

public class Candle {
    private int height;
    private double diameter;
    private String color;
    private boolean isLit;

    public Candle(int height, double diameter, String color) {
        this.height = height;
        this.diameter = diameter;
        this.color = color;
        this.isLit = false;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return this.color;
    }

    public void lightCandle() {
        this.isLit = true;
    }

    public void extinguishCandle() {
        this.isLit = false;
    }

    public String toString() {
        String candle = "Candle ";
        candle += "[color=" + this.color + ", height=" +
                this.height + ", diameter=" +
                this.diameter + ", isLit=" +
                this.isLit + "]";
        return candle;
    }
}
