package DataStructurePractice;

import java.util.Scanner;
import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stringStack = new Stack<>();

        System.out.println("Input a string and press Enter: ");
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            stringStack.push(input);
        }

        printStack(stringStack);

        System.out.println(findObject("3", stringStack));
    }

    static Object findObject(String s, Stack stack) {
        return stack.search(s);
    }

    static void printStack(Stack stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        System.out.println("Stack contains:");
        for (Object s : stack) {
            System.out.println(s);
        }
    }
}
