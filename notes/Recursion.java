public class Recursion{

    public static void main(String[] args){
        System.out.println(factorial(5)); 
    }

    public static int factorial(int n){
        
        int finalVal = 1;

        if(n < 0){
            System.out.println("the value is negative - thus a factorial cannot be taken");
            return 0;  
        }
        
        int i = 1; 
        while(i >= n){
            finalVal *= i; 
            i +=1; 
        }

        return finalVal; 
    }

    //method which calls itself
    public static int factorialRecursive(int n){
        
        if(n==1) return 1; 

        return n* factorialRecursive(n-1); 
    }

    public static int Fibonacci(int n){

        //F(n) = F(n-1) + F(n-2)

        //base case

        if(n == 0) return 1;
        if(n == 1) return 1; 

        //recursive case
        int finVal = factorialRecursive(n-1)+ factorialRecursive(n-2); 
        
        return finVal; 
    }

}