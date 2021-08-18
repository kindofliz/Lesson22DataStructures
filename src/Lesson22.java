import java.util.*;

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

        // String stringToTest = "mom";
        // String stringToTest = "not a palindrome";
        // String stringToTest = "Mom"; //add equalsIgnoreCase
        String stringToTest = "Ma - dam";

        //making sure it removes all special characters
        stringToTest = stringToTest.replaceAll("[^a-zA-Z0-9]", "");

        if (isPalindrome(stringToTest)) {
            System.out.println("It is a palindrome!");
        } else {
            System.out.println("It is not a palindrome!");
        }
        System.out.println();




        //DAY 22 - TASK 1
        //SORTING A STRING TYPE ARRAYLIST USING BUBBLESORT
        ArrayList<String> superHeroes = new ArrayList<>();
        superHeroes.add("dogoMom");
        superHeroes.add("superCat");
        superHeroes.add("peopleWhisperer");
        superHeroes.add("toolMan");
        superHeroes.add("mrForest");
        superHeroes.add("rain");
        superHeroes.add("thunderWoman");

        System.out.println("Unsorted arrayList: " + superHeroes);

        for (int i = 0; i < superHeroes.size(); i++) {
            for (int j = i+1; j < superHeroes.size() ; j++) {
                if (superHeroes.get(j).compareToIgnoreCase(superHeroes.get(i)) < 0) {
                    String temp = superHeroes.get(j);
                    superHeroes.set(j, superHeroes.get(i));
                    superHeroes.set(i, temp);
                }
            }

            superHeroes.get(i);
        }

        System.out.println("Sorted arrayList: " + superHeroes);
        System.out.println();





        //DAY 23 LECTURE - TreeSet, 1-N
        //CREATING A TREESET (IT AUTOMATICALLY SORTS IT FROM SMALLEST TO LARGEST)
        TreeSet<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(-2000);
        myTreeSet.add(18);
        myTreeSet.add(59);
        myTreeSet.add(1);
        myTreeSet.add(1994);
        myTreeSet.add(18); //not added because it's a duplicate

        //TreeSet METHODS:

        //Print whole TreeSet
        System.out.println("The whole TreeSet: " + myTreeSet);

        //Get the first element (smallest)
        System.out.println("Smallest element: " + myTreeSet.first());

        //Get the last element (largest)
        System.out.println("Largest element: " + myTreeSet.last());

        //Removing an element - need to specify the element
        myTreeSet.remove(59);
        System.out.println("The whole set after removing 59: " + myTreeSet);


        //TRYING TREESET WITH STRINGS (automatically sorts it alphabetically)
        TreeSet<String> myStringTreeSet = new TreeSet<>();
        myStringTreeSet.add("Cat");
        myStringTreeSet.add("Dog");
        myStringTreeSet.add("Oxana");
        myStringTreeSet.add("Artjoms");
        myStringTreeSet.add("Martins");

        System.out.println("String TreeSet: " + myStringTreeSet);



        //1-N Tree (one-to-many) Data structure















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
