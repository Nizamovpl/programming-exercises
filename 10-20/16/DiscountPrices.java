import java.util.Scanner;

public class DiscountPrices{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the total price of your purchase"); 
        int price; 
        price = scanner.nextInt(); 
        if(price > 10.00){
            System.out.println(price); 
            price = price*(9/10); 
            System.out.println("The discounted price is: "+price); 
        }else{
            System.out.println("There is no discount"); 
        }; 
    }
}
