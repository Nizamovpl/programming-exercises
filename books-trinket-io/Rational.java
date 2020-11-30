public class Rational{
    public int num, denom; 
    
    public Rational(){
        this.num = 0; 
        this.denom = 1; 
    }

    public Rational(num, denom){
        this.num = num; 
        this.denom = denom; 

    }

    public printRational(){

        
    }


}



// A “rational number” is a number that can be represented as the ratio of two integers. 
//For example, 2/3 is a rational number, and you can think of 7 as a rational number with an implicit 1 in the denominator.

// The purpose of this exercise is to write a class definition that includes a variety of methods, 
//including constructors, static methods, instance methods, modifiers, and pure methods:

// Define a class called Rational.
// A Rational object should have two integer instance variables that store the numerator and denominator.
// Write a constructor that takes no arguments and sets the numerator to 0 and denominator to 1.
// Write an instance method called printRational that displays a Rational object in a reasonable format.
// Write a main method that creates a new object with type Rational, sets its instance variables to the values of your choice, 
//and displays the object.
// You now have a minimal testable program. Test it and, if necessary, debug it.
// Write a toString method for Rational and test it using println.
// Write a second constructor that takes two arguments and uses them to initialize the instance variables.
// Write an instance method called negate that reverses the sign of a rational number. This method should be a modifier, so it should be void. Add lines to main to test the new method.
// Write an instance method called invert that swaps the numerator and denominator. It should be a modifier. Add lines to main to test the new method.
// Write an instance method called toDouble that converts the rational number to a double (floating-point number) and returns the result. 
//This method is a pure method; it does not modify the object. 
//As always, test the new method.
// Write an instance method named reduce that reduces a rational number to its lowest terms by finding the greatest common divisor (GCD) of the numerator and denominator and dividing through.
// This method should be a pure method; it should not modify the instance variables of the object on which it is invoked.
// Hint: Finding the GCD takes only a few lines of code. Search the web for “Euclidean algorithm”.

// Write an instance method called add that takes a Rational number as an argument, adds it to this, and returns a new Rational object. 
//There are several ways to add fractions. You can use any one you want, but you should make sure that the result of the operation is reduced so that the 
//numerator and denominator have no common divisor (other than 1).