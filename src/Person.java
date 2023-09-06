public class Person {
    // Define the properties of the Person class
    String firstName;
    int age;

    // Define the constructor of the Person class
    public Person(String firstName, int age) {
        // Set the properties of the Person class
        this.firstName = firstName;
       
        this.age = age;
    }

    // Define the greet method of the Person class
    public void greet() {
        System.out.println("Moi, my name is " + this.firstName + " " + " and I am " + this.age + " years old.");
    }
}
