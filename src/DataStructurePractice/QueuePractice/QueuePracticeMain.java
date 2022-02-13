package DataStructurePractice.QueuePractice;

import java.util.Scanner;

/**
 * Queues are designed to hold elements prior to processing.
 */
public class QueuePracticeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomBaledungQueue queue = new CustomBaledungQueue();

        System.out.println("Enter a string and press Enter: ");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {break;}

            queue.offer(input);
        }

        while (queue.iterator().hasNext()) {
            System.out.println(queue.poll());
        }
    }
}
