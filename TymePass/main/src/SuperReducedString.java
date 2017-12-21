import java.util.Arrays;
import java.util.Scanner;

public class SuperReducedString
{
    private static class CharStack
    {
        char[] stack;
        int pointer = -1;

        CharStack(int capacity) {
            stack = new char[capacity];
            pointer = -1;
        }

        void push(char character) {
            pointer++;
            stack[pointer] = character;
        }

        char pop() {
            return stack[pointer--];
        }

        char peek() {
            return stack[pointer];
        }

        boolean isEmpty () {
            return  pointer == -1;
        }

        char[] getStack() {
            return Arrays.copyOf(stack, pointer+1);
        }
    }

    static String super_reduced_string(String s){
        char[] charArray = s.toCharArray();
        CharStack charStack = new CharStack(charArray.length-1);
        for (int i=0; i<charArray.length; i++) {
            if (!charStack.isEmpty() && charStack.peek() == charArray[i]) {
                charStack.pop();
            } else {
                charStack.push(charArray[i]);
            }
        }
        if (charStack.isEmpty()) {
            return "Empty String";
        } else {
            return new String(charStack.getStack());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.print(result);
    }
}
