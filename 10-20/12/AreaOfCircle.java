import java.lang.Math; 
import java.util.Scanner;

//area = pi * r^2
public class AreaOfCircle{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is the radius of your circle?");
        int radius = scanner.nextInt();  

        double area = radius*radius*Math.PI;
        
        System.out.println("The area of the circle is " + area); 



    }

}