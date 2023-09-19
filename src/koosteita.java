import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Comparator;



public class koosteita {

    public static void main(String[] args) {
        
            //priority queue example
    PriorityQueue<String> myQueue2 = new PriorityQueue<String>();
    myQueue2.add("John");
    myQueue2.add("Doe");
    myQueue2.add("Smith");
    myQueue2.add("Mary");
    // System.out.println(myQueue2.peek());
    // String arvo = myQueue2.poll();
    // System.out.println(arvo);
    // System.out.println(myQueue2.peek());

    //priority queue example with comparator

    
    // offer() method
    // Queue<String> myQueue = new LinkedList<String>();
    // myQueue.offer("John");
    // myQueue.offer("Doe");
    // myQueue.offer("Mary");
    // myQueue.offer("Smith");
    // System.out.println(myQueue.peek());
    // String arvo = myQueue.poll();
    // System.out.println(arvo);
    // System.out.println(myQueue.peek());

//offer() tarjoaa falsen jos queue on täynnä. add() heittää exceptionin

// PriorityQueue<Person> PersonsQueue = new PriorityQueue<>(
//      Comparator.comparing((Person P) -> P.age, Comparator.reverseOrder())
// );

// PriorityQueue<Person> PersonsQueue = new PriorityQueue<>(
//      Comparator.comparing((Person P) -> P.age).reversed()
// );

PriorityQueue<Person> PersonsQueue = new PriorityQueue<>(
        Comparator.comparing((Person person) -> person.age).reversed()
);

PersonsQueue.offer(new Person(10));
PersonsQueue.offer(new Person(20));
PersonsQueue.offer(new Person(30));
PersonsQueue.offer(new Person(40));

System.out.println(PersonsQueue.peek().getAge());
Person arvo2 = PersonsQueue.poll();
System.out.println(arvo2.getAge());
System.out.println(PersonsQueue.peek().getAge());

}
//Luokka Person
  static class Person {
    private final Integer age;

    public Person(Integer age) {
        this.age = age;
    }

    //getter metodi luokan ominaisuudelle age
    public Integer getAge() {
        return age;
    }





    }
}