import java.util.Scanner;

public class OrderChecker{

    public void main (String[] args){
        Scanner scanner = new Scanner(System.in);
    

        System.out.println("What's the number of bolts you want to buy?"); 
        int bolts = scanner.nextInt();
        System.out.println("What's the number of nuts you want to buy?"); 
        int nuts = scanner.nextInt();
        System.out.println("What's the number of washers you want to buy?"); 
        int washers = scanner.nextInt();

        if(nuts>= bolts && washers >= (2*bolts)){
            int boltcost = bolts*5; 
            int nutscost = 3*nuts;
            //washer not needed because it is one to one

            System.out.println("TotalCost: $" + ((boltcost+nutscost+washers)/100)); 


            //nested function later down the line seperate from main to do calculations
            //add code that transfers cents to dollars
        }else{
         //System.out.println("There is an error with this order; please try again"); 
         //later down on the line I want to add something that re runs this series of code. 
         //I don't know how though   
        }

    }
}