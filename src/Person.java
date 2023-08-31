public class Person {
    // Define the properties of the Person class
    String firstName;
    String lastName;
    int age;

    // Define the constructor of the Person class
    public Person(String firstName, String lastName, int age) {
        // Set the properties of the Person class
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Define the greet method of the Person class
    public void greet() {
        System.out.println("Moi, my name is " + this.firstName + " " + this.lastName + " and I am " + this.age + " years old.");
    }
}
