// d = (1/2)gt2

import java.util.Scanner; 
import java.lang.Math; 

public class DistanceBrickTravels{
    
    public static void main(String[] args){
        double time; 
        double gravity ;
        double distance;  
        Scanner scanner = new Scanner(System.in); 
        System.out.println("What is the gravity (meters per second squared)?");
        gravity = scanner.nextDouble(); 
        System.out.println("What is the amount of time it took to fall?");
        time = scanner.nextDouble();
        distance = (1/2)*gravity*Math.pow(time, 2)*gravity ; 
        System.out.println("It went" + distance + "meters"); 


    }



}