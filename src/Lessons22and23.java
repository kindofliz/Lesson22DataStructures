import java.util.*;
import java.util.stream.Collectors;

public class Lessons22and23 {
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
            for (int j = i + 1; j < superHeroes.size(); j++) {
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
        System.out.println();


        //1-N (one-to-many) Tree Data structure
        //...
        //1-N binary search tree
        //...
        //N-N Graph
        //...
        //HashMap and HashTable







        //DAY 23 TASK 1

        //Create a HashMap for the product price page where all products will be as the key and the price as the value.
        HashMap<String, Integer> productPrice = new HashMap<>();

        //Save at least 8 products in the HashMap.
        productPrice.put("Apple", 1);
        productPrice.put("Milk", 2);
        productPrice.put("Cheese", 6);
        productPrice.put("Computer", 900);
        productPrice.put("Couch", 500);
        productPrice.put("Chocolate", 1);
        productPrice.put("Mobile phone", 400);
        productPrice.put("Sourcream", 1);

        //Find out how many products are under 1 eur.
        int counterPricesUnder1 = 0;
        for (Integer price : productPrice.values()) {
            if (price <= 1) {
                counterPricesUnder1++;
            }
        }

        System.out.println("There are " + counterPricesUnder1 + " items below 1 eur");
        System.out.println();


        //Find out which product price is the lowest
        int min = productPrice.get("Apple");
        for (Integer price : productPrice.values()) {
            if (price < min) {
                min = price;
            }
        }
        for (String productName: productPrice.keySet()) {
            if (productPrice.get(productName) == min) {
                System.out.println(productName + " has the lowest price! It's " + min + " Eur.");
            }
        }
        System.out.println();


        //Find out which product price is the highest
        int max = 0;
        for (Integer price : productPrice.values()) {
            if (price > max) {
                max = price;
            }
        }
        for (String productName: productPrice.keySet()) {
            if (productPrice.get(productName) == max) {
                System.out.println(productName + " has the highest price! It's " + max + " Eur.");
            }
        }
        System.out.println();



        //Create a new HashMap with other products.
        HashMap<String, Integer> productPriceNew = new HashMap<>();

        //Save at least 8 products in the HashMap.
        productPriceNew.put("Banana", 1);
        productPriceNew.put("Bread", 2);
        productPriceNew.put("BBQ Sauce", 4);
        productPriceNew.put("Pan", 40);
        productPriceNew.put("Desk", 200);
        productPriceNew.put("Tomatoes", 2);
        productPriceNew.put("TV", 350);
        productPriceNew.put("Mayo", 3);

        //Merge both HashMaps
        productPrice.putAll(productPriceNew);
        System.out.println("Number of products in the merged HashMap: " + productPrice.size());
        System.out.println();

        //*Sort all values in ascending order.
        HashMap<String, Integer> sortedProductPrice = productPrice.entrySet().stream().sorted(Comparator.comparingInt(value -> value.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b) -> {throw new AssertionError();}, LinkedHashMap::new));
        sortedProductPrice.entrySet().forEach(System.out::println);
        System.out.println();






        //Same with HASHTABLE
        Hashtable<String, Integer> productPriceTable = new Hashtable<>();

        //Save at least 8 products in the HashMap.
        productPriceTable.put("Apple", 1);
        productPriceTable.put("Milk", 2);
        productPriceTable.put("Cheese", 6);
        productPriceTable.put("Computer", 900);
        productPriceTable.put("Couch", 500);
        productPriceTable.put("Chocolate", 1);
        productPriceTable.put("Mobile phone", 400);
        productPriceTable.put("Sourcream", 1);

        //Find out how many products are under 1 eur.
        int counterUnder1 = 0;
        for (Integer price : productPriceTable.values()) {
            if (price <= 1) {
                counterUnder1++;
            }
        }

        System.out.println("TABLE. There are " + counterUnder1 + " items below 1 eur");
        System.out.println();


        //Find out which product price is the lowest
        int minPrice = productPriceTable.get("Apple");
        for (Integer price : productPriceTable.values()) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        for (String productName: productPriceTable.keySet()) {
            if (productPriceTable.get(productName) == minPrice) {
                System.out.println("TABLE. " + productName + " has the lowest price! It's " + minPrice + " Eur.");
            }
        }
        System.out.println();


        //Find out which product price is the highest
        int maxPrice = 0;
        for (Integer price : productPriceTable.values()) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        for (String productName: productPriceTable.keySet()) {
            if (productPrice.get(productName) == maxPrice) {
                System.out.println("TABLE. " + productName + " has the highest price! It's " + maxPrice + " Eur.");
            }
        }
        System.out.println();





        //Create a new HashMap with other products.
        HashMap<String, Integer> productPriceTableNew = new HashMap<>();

        //Save at least 8 products in the HashMap.
        productPriceTableNew.put("Banana", 1);
        productPriceTableNew.put("Bread", 2);
        productPriceTableNew.put("BBQ Sauce", 4);
        productPriceTableNew.put("Pan", 40);
        productPriceTableNew.put("Desk", 200);
        productPriceTableNew.put("Tomatoes", 2);
        productPriceTableNew.put("TV", 350);
        productPriceTableNew.put("Mayo", 3);

        //Merge both HashMaps
        productPriceTable.putAll(productPriceTableNew);
        System.out.println("TABLE. Number of products in the merged HashTable: " + productPriceTable.size());
        System.out.println();


        //*Sort all values in ascending order WITH LAMBDA
        HashMap<String, Integer> sortedProductPriceTable = productPriceTable.entrySet().stream().sorted(Comparator.comparingInt(value -> value.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b) -> {throw new AssertionError();}, LinkedHashMap::new));
        System.out.println("TABLE SORTED:");
        sortedProductPriceTable.entrySet().forEach(System.out::println);
        System.out.println();


        //*Sort all values in ascending order ANOTHER WAY
        HashMap<String, Integer> sortedProductPriceTable2 = productPriceTable.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(),(entry1, entry2) -> entry2, LinkedHashMap::new));
        System.out.println("TABLE SORTED BY VALUE (DIFFERENT METHOD): " + sortedProductPriceTable2);












    }




//WRITING A METHOD TO TEST A PALINDROME USING STACK
static boolean isPalindrome(String possiblePalindrome){

        //CREATING A STACK
        Stack<String> myStack=new Stack<>();
        //DEFINING A VARIABLE FOR THE FIRST HALF OF THE STRING (to compare to the second half)
        int halfTheLength=possiblePalindrome.length()/2;

        //pushing the first half of the string to the stack by characters
        for(int i=0;i<halfTheLength; i++){
        myStack.push(Character.toString(possiblePalindrome.charAt(i)));
        }

        //checking if the string is odd and then increasing to the other half of the string (half++)
        if(possiblePalindrome.length()%2!=0){
        halfTheLength++;
        }

        //comparing first half to the second half ???
        for(int i=halfTheLength;i<possiblePalindrome.length();i++){
        if(!Character.toString(possiblePalindrome.charAt(i)).equalsIgnoreCase(myStack.pop())){
        return false;
        }
        }
        return true;
        }



}
