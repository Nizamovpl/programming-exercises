// Write a program that asks the user to enter a word. The program will then repeat word for as many times as it has characters:

// Enter a word:
// Hello

// Hello
// Hello
// Hello
// Hello
// Hello
// To do this you will need to use the length() method of String that counts the number of characters in a string:

// String inputString;
// int times;

//  . . . .

// times = inputString.length()

import java.util.Scanner; 

public class EchoWord{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a word: "); 
        String inputString = scanner.next();
        int times = inputString.length(); 

        while (times > 0){
          System.out.println(inputString); 
          times = times-1;   
        }
    }
}