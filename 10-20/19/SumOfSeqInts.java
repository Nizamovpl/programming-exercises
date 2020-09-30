//figure out how to get n into the next method; might have to learn classes

import java.util.Scanner; 

public class SumOfSeqInts{

    public static int userImput(){
        Scanner scanner = new Scanner(System.in); 

        System.out.println("enter n: ");
        int n = scanner.nextInt();

        return n; 
    }

    
    public static int formula(n){

        
    } 
    
    public static void main(){
        int n; 
         userImput(); 
         formula(); 
    }

    //create a function here for formula

    //loop imput here
    
}

//what would happen if you entered a string instead of an INt




// Write a program that asks the user for N and then sum all the integers (inclusive) between 1 and N.

// Enter N:
// 10
// Sum = 55
// Do this in a loop that counts up 1 to N and in each iteration adds the current count to the sum.

// Another way to calculate the same thing is through a formula:

// sum = (n*(n+1))/2
// Modify your program so that it calculates the sum both ways:

// Enter N:
// 10
// Loop Sum = 55
// Formula Sum = 55
// You might worry that the formula will lead to integer division problems. But it works as is. Why? (Hint: think about even and odd.)

// The sum of sequential integers 1 to N is called a triangle number. See the exercises for chapter 25.

