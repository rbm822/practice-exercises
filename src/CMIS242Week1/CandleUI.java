package CMIS242Week1;

import java.util.Scanner;

public class CandleUI {
    private Scanner scanner;
    private CandleWarehouse candleWarehouse;

    public CandleUI(Scanner scanner) {
        this.scanner = scanner;
        this.candleWarehouse = new CandleWarehouse();
    }

    public void start() {
        while(true) {
            System.out.println("\tMENU\t");
            System.out.println("1. Add Candle");
            System.out.println("2. Remove Candle");
            System.out.println("3. Light Candle");
            System.out.println("4. Extinguish Candle");
            System.out.println("5. Display Candles");
            System.out.println("9. Exit");

            System.out.printf("Enter your selection: ");
            int selection = Integer.parseInt(scanner.nextLine());

            if (selection == 9) {
                System.out.println("Thank you for using the program. Goodbye!");
                break;
            }

            if (selection == 1) {
                System.out.println("Enter the candle's height: ");
                int height = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the candle's diameter: ");
                double diameter = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter the candle's color: ");
                String color = scanner.nextLine();

                Candle candle = new Candle(height, diameter, color);
                this.candleWarehouse.addCandle(candle);
            }

            if (selection == 2) {
                System.out.println("Enter the height of the candle you want to remove: ");
                int height = Integer.parseInt(scanner.nextLine());
                System.out.println("What is the color of the candle you want to remove: ");
                String color = scanner.nextLine();

                this.candleWarehouse.removeCandle(height, color);
            }

            if (selection == 3) {
                System.out.println("What is the height of the candle you want to light/extinguish? ");
                int height = Integer.parseInt(scanner.nextLine());
                System.out.println("What is the color of the candle you want to light/extinguish? ");
                String color = scanner.nextLine();

                Candle candleToLight = this.candleWarehouse.findCandle(height, color);
                candleToLight.lightCandle();
                System.out.println("Lit/extinguished candle: " + candleToLight);
            }

            if (selection == 4) {
                System.out.println("What is the height of the candle you want to light/extinguish? ");
                int height = Integer.parseInt(scanner.nextLine());
                System.out.println("What is the color of the candle you want to light/extinguish? ");
                String color = scanner.nextLine();

                Candle candleToExtinguish = this.candleWarehouse.findCandle(height, color);
                candleToExtinguish.extinguishCandle();
                System.out.println("Lit/extinguished candle: " + candleToExtinguish);
            }

            if (selection == 5) {
                this.candleWarehouse.printCandles();
            }
        }
    }
}
