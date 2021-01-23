package io.github.petriankin;

import java.util.ArrayDeque;
import java.util.Deque;

// TODO: 23.01.2021 add brackets
public class ReversePolishNotationCalculator {
    public static int calculate(String input) {
        if (input == null) {
            return 0;
        }
        String[] inputArray = input.split("\\s");
        Deque<Integer> stack = new ArrayDeque<>();

        for (String s : inputArray) {
            switch (s) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(stack.pop() - stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    stack.push(stack.pop() / stack.pop());
                    break;
                default:
                    stack.add(Integer.parseInt(s));
                    break;
            }
        }
        return stack.pop();
    }
}
