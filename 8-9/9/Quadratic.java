//a = coefficiant before x^2
//b = x coefficiant
//c = middle term
//y = answer
// y = (-b+-(b^2+4ac))/2ac
import java.lang.Math; 

public class Quadratic{
    public static void main(String[] args){
        double a = 1; 
        double b = 2; 
        double c = 1;
        double d; 
        double ypos; 
        double yneg; 

        ypos = 0; 
        yneg = 0; 
        d = (Math.pow(b, 2 + 4*a*c)); 
        ypos = (-b + Math.sqrt(d))/(2*a*c);
        yneg = (-b - Math.sqrt(d))/(2*a*c);

        //figure out how to maybe do if then if they are the same to eliminate that error
        System.out.println("The answer to the quadradic formula is: "+ ypos + "and" + yneg); 

        

    }
}


