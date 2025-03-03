package queueeschallenge;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello")); // tochararray result = ['h','e','l','l','o']
        System.out.println(checkForPalindrome("Don't node"));
    }

    public static boolean checkForPalindrome(String text) {
        System.out.println("initial text= " + text);
        text = text.replaceAll("[.,'?\\-\\s]", "").toLowerCase(Locale.ENGLISH);

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        char[] chars = text.toCharArray();
        for (char c : chars) {
            stack.push(c); //stack => o,l,l,e,h    ----- a,b,c,c,b,a
            queue.offer(c); // queue = > h-e-l-l-o ----- a,b,c,c,b,a


        }
        System.out.println("queue" + queue);
        System.out.println("stack" + stack);

        while (!queue.isEmpty()) {
            Character character = queue.remove();
            System.out.println("removedItem: " + character);
            if (character != stack.pop()) {
                return false;
            }
        }
        return true;


    }
}
