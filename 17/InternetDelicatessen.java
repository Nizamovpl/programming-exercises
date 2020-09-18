import java.util.Scanner;

public class InternetDelicatessen{
    
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in); 
        double finalPrice = 0; 
        double delivery = 0; 
        //enters tuna Salad, Price, and over night deilivery
        System.out.println("What is the item?"); 
        String item = scanner.next(); 
        System.out.println("What is the price of it?"); 
        double price = scanner.nextDouble();
        System.out.println("Overnight delivery true/false?");  
        boolean isOverknightDelivery = scanner.nextBoolean(); 

        if (isOverknightDelivery && price > 10){
            delivery = 5.00; 
        }else if(price < 10 && isOverknightDelivery){
            delivery = 3.00; 
        }else if(!isOverknightDelivery && price > 10){
            delivery = 2.00; 
        }else{
            delivery = 0.00; 
        }
        
        finalPrice = price+delivery; 

        System.out.println("Invoice /n" + item +"   " + price + "/n delivery   " + delivery + "total    " + finalPrice); 



    }

}