import java.util.Scanner;

public class App {
public static void main(String[] args) {
    int result = fibonacci(6);  // Finding the 6th Fibonacci number using recursion
    System.out.println(result); // Output: 8
       
        
    }
// create method for printing stars
         public static void printStars(){

              System.out.println("*****");
       }
// create method for printing number
       public static int tulostaNumero() {
              int summa = 1+2;
              return summa;
       }

       // create method for summing two numbers
         public static int summa(int eka, int toka) {
                  int summa = eka + toka;
                  return summa;
         }


        // Recursive method to find the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases: if n is 0 or 1, return n
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive case: sum of (n-1)th and (n-2)th Fibonacci numbers
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
