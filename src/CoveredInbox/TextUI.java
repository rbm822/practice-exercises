package CoveredInbox;

import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private CoveredInbox inbox;

    public TextUI(Scanner scanner) {
        this.scanner = scanner;
        this.inbox = new CoveredInbox();
    }

    public void start() {
        while (true) {
            System.out.println("\tMENU\t");
            System.out.println("1. Open Inbox");
            System.out.println("2. Close Inbox");
            System.out.println("3. Add Letter To Inbox");
            System.out.println("4. Remove Letter From Inbox");
            System.out.println("5. Check Number of Letters In Inbox");
            System.out.println("9. Exit");

            System.out.print("Enter your selection: ");
            int selection = scanner.nextInt();

            if (selection == 9) {
                System.out.println("Goodbye!");
                break;
            }

            if (selection == 1) {
                this.inbox.openInbox();
            }

            if (selection == 2) {
                this.inbox.closeInbox();
            }

            if (selection == 3) {
                if (this.inbox.isOpened()) {
                    this.inbox.addLetter();
                } else {
                    System.out.println("Cannot add letter. Inbox is closed!");
                }
            }

            if (selection == 4) {
                if (this.inbox.getNumOfLetters() > 0) {
                    this.inbox.removeLetter();
                } else {
                    System.out.println("Cannot remove letter. Inbox is empty!");
                }
            }

            if (selection == 5) {
                int lettersInInbox = this.inbox.getNumOfLetters();
                System.out.println("Letters in inbox: " + lettersInInbox);
            }
        }
    }
}
