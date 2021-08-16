import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lesson22 {
    public static void main(String[] args) {


        //CREATING A STACK

        Stack<String> myStringStack = new Stack<>();
        myStringStack.push("Liza!");
        myStringStack.push("is");
        myStringStack.push("name");
        myStringStack.push("my");
        myStringStack.push("Hello");

        //PRINTING THE STACK OUT
        int stackSize = myStringStack.size();
        //the stack gets shorter after each pop
        //which is why we need to first create a static variable of its size before "popping" it

        for (int i = 0; i < stackSize; i++) {
            System.out.println(myStringStack.pop());
        }
        System.out.println();


        //CREATING A QUEUE
        //LinkedList is implementing a Queue
        Queue<String> myStringQueue = new LinkedList<>();

        myStringQueue.add("It");
        myStringQueue.add("is");
        myStringQueue.add("a");
        myStringQueue.add("Wonderful");
        myStringQueue.add("day!");

        //PRINTING THE QUEUE OUT
        int myQueueLength = myStringQueue.size();
        for (int i = 0; i < myQueueLength; i++) {
            System.out.println(myStringQueue.remove());

        }
        System.out.println();



        //TASK 1
        //USING A STACK ALGORITHM TO SOLVE PALINDROMES

//        String stringToTest = "mom";
//        String stringToTest = "not a palindrome";
//        String stringToTest = "Mom"; //add equalsIgnoreCase
        String stringToTest = "Ma - dam";

        //making sure it removes all special characters
        stringToTest = stringToTest.replaceAll("[^a-zA-Z0-9]", "");

        if (isPalindrome(stringToTest)) {
            System.out.println("It is a palindrome!");
        } else {
            System.out.println("It is not a palindrome!");
        }







    }

    //WRITING A METHOD TO TEST A PALINDROME USING STACK
    static boolean isPalindrome(String possiblePalindrome) {

        //CREATING A STACK
        Stack<String> myStack = new Stack<>();
        //DEFINING A VARIABLE FOR THE FIRST HALF OF THE STRING (to compare to the second half)
        int halfTheLength = possiblePalindrome.length() / 2;

        //pushing the first half of the string to the stack by characters
        for (int i = 0; i < halfTheLength; i++) {
            myStack.push(Character.toString(possiblePalindrome.charAt(i)));
        }

        //checking if the string is odd and then increasing to the other half of the string (half++)
        if(possiblePalindrome.length() %2 != 0) {
            halfTheLength++;
        }

        //comparing first half to the second half ???
        for (int i = halfTheLength; i < possiblePalindrome.length(); i++) {
            if (!Character.toString(possiblePalindrome.charAt(i)).equalsIgnoreCase(myStack.pop())) {
                return false;
            }
        }
        return true;
    }
}
