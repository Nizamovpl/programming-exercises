import java.util.Scanner;

public class PieEatingContest{
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
    
        int weight; 

        System.out.println("What is your weight?");
        weight = scanner.nextInt(); 

        if (220 < weight && weight < 280){
            System.out.println("You are able to enter the contest"); 
        }else{
            System.out.println("You don't have the weight to enter"); 
        }; 

        
    }
    
}
    
    
