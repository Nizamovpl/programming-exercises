import java.util.Scanner;

public class AnnualApplianceCost{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double annCost;  
        System.out.println("Cost per kilo-watt hour: ");
        int kwHourCent = scanner.nextInt();
        System.out.println("Kilowatts used per year");
        int kwHourYear = scanner.nextInt();
        
        annCost = (double)kwHourCent* (double)kwHourYear;
        System.out.println("Your anual electic bill is: "+ annCost);  
    }


}