import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;



public class App {
    public static void main(String[] args) {
        // basic array example
        int[] numbers = { 1, 2, 3, 4, 5 };
        int[] numbers2 = new int[5];
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;

        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = i + 1;
        }

        // System.out.println(numbers[0]);
        // System.out.println(numbers[1]);
        // System.out.println(numbers[2]);
        // System.out.println(numbers[3]);

        // for (int i = 0; i < numbers.length; i++) {
        // System.out.println(numbers[i]);
        // }

        // for (int i : numbers) {
        // System.out.println(i);
        // }

        // for (int i : numbers) {

        // System.out.println(i);
        // }

        // ArrayList<String> names = new ArrayList<String>();
        // names.add("John");
        // names.add("Doe");

        // for (String name : names) {
        // System.out.println(name);
        // }

        // HashMap example
        HashMap<String, String> person = new HashMap<String, String>();
        person.put("name", "John");
        person.put("age", "30");
        person.put("height", "6ft");

        // System.out.println(person.get("name"));
        // System.out.println(person.get("age"));
        // System.out.println(person.get("height"));

        // int[] numbers = {1,2,3,4,5};
        // int[] newNumbers = paramArray(numbers);
        // for (int i : newNumbers) {
        // System.out.println(i);
        // }

        // }
        // //method example for passing and returning an array as a parameter
        // public static int[] paramArray(int[] numbers) {
        // for (int i = 0; i < numbers.length; i++) {
        // numbers[i] += 1;

        // }
        // return numbers;
        // }

        // set example

   




        // removing duplicates from an array
        // ArrayList<Integer> myListWithDuplicates = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3));
    
        //  Set<Integer> mySetFromList = new HashSet<>(myListWithDuplicates);


        // for (Integer i : mySetFromList) {
        //     System.out.println("setin sisältö "+i);
        // }
        // myListWithDuplicates.clear();
        // myListWithDuplicates.addAll(mySetFromList);
        // for (Integer i : myListWithDuplicates) {
        //     System.out.println("alkup. lista siivottuna: "+i);
        // }


//queue with linkedlist
        // Queue<String> myQueue = new LinkedList<String>();
        // myQueue.add("John");
        // myQueue.add("Doe");
        // myQueue.add("Mary");
        // myQueue.add("Smith");

        // System.out.println(myQueue.peek());
        // String arvo = myQueue.poll();
        // System.out.println(arvo);
        // System.out.println(myQueue.peek());
        
        // for (String name : myQueue) {
        // System.out.println(name);
        // }

// stack example
        Stack<String> myStack = new Stack<String>();
        
        myStack.push("John");
        myStack.push("Doe");
        myStack.push("Mary");
        myStack.push("Smith");

        // String LastPushed = myStack.pop();
        // System.out.println(LastPushed);

        // System.out.println(myStack.peek());
        // String arvo = myStack.pop();
        // System.out.println(arvo);
        // System.out.println(myStack.peek());
        
        for (String name : myStack) {
        System.out.println(name);
        }


    }
}