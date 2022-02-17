package ConcurrentProgramming;

import java.util.Random;

/**
 * Sends a series of messages.
 * The string "DONE" indicates that all messages have been sent.
 */
public class Producer implements Runnable {
    private Drop drop;

    public Producer(Drop drop) {
        this.drop = drop;
    }

    @Override
    public void run() {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat moats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };
        Random random = new Random();
        for (int i = 0; i < importantInfo.length; i++) {
            drop.put(importantInfo[i]);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {

            }
        }

        drop.put("DONE");
    }
}
