public class muokkailua {
    
    public static void main(String[] args) {

        //ternary operator
        int a = 10;
        int b = 20;
        int c = a > b ? a : b;
        System.out.println(c);
        //output: 20
        
    
        //int a = 10;
        //int b = 20;
        
       // int max = (a > b) ? a : b;
       // System.out.println("Maximum value is: " + max);  
        // Output: Maximum value is: 20
        
    
    
    
   // int a = 10;
   // int b = 20;
  //  int c = 30;
    
  //  int result = a > b ? (a > c ? a : c) : (b > c ? b : c);
  //  System.out.println("Maximum value is: " + result);  // Output: Maximum value is: 30
    
    /*
      Step 1: We first check the condition (a > b), which will dictate which of the next two steps we will go to.
    
        a > b ? 
    
          Step 2A: If the condition (a > b) is true, we come to this step, where we check another condition: (a > c).
          If this condition is true, a is the maximum value, otherwise, c is the maximum value.
    
            (
              a > c ? a : c 
            )
            
          :
    
          Step 3A: If the initial condition (a > b) is false, we come to this step, where we check yet another condition: (b > c).
          If this condition is true, b is the maximum value, otherwise, c is the maximum value.
    
            (
              b > c ? b : c
            );
    
      Step 4: Depending on the outcomes of the above conditions, one of the values (a, b, or c) will be selected as the result.
    */
    
    
        
        //if a > b, c = a, else c = b
        
        //if (a > b) {
        //    c = a;
        //} else {
        //    c = b;
        //}
    
        }
}
