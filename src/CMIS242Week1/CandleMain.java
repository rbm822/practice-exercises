package CMIS242Week1;

import java.util.Scanner;

public class CandleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CandleUI candleUI = new CandleUI(scanner);
        candleUI.start();
    }
}
