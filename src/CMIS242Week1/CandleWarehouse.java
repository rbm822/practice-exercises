package CMIS242Week1;

import java.util.ArrayList;
import java.util.List;

public class CandleWarehouse {
    private List<Candle> candleWarehouse;

    public CandleWarehouse() {
        this.candleWarehouse = new ArrayList<>();
    }

    public void addCandle(Candle candle) {
        this.candleWarehouse.add(candle);
        System.out.println("The following candle was created: " + candle);
    }

    public void removeCandle(int height, String color) {
        Candle candleToRemove = findCandle(height, color);
        this.candleWarehouse.remove(candleToRemove);
        System.out.println("Removed the following candle: " + candleToRemove);
    }

    public void printCandles() {
        for (Candle candle : this.candleWarehouse) {
            System.out.println(candle);
        }
    }

    public Candle findCandle(int height, String color) {
        Candle candleToFind = null;

        for (Candle candle : this.candleWarehouse) {
            if (candle.getHeight() == height && candle.getColor().equals(color)) {
                candleToFind = candle;
            }
        }

        return candleToFind;
    }
}
