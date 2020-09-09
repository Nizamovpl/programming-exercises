import java.util.Scanner;

//Boring one in case my other one fails
public class WeekTemp{
    public static void main(final String[] args){
        final Scanner scanner = new Scanner(System.in); 

        System.out.println("What is Sunday's tempurature?"); 
        final String sun = scanner.next(); 
        System.out.println("What is Mondays's tempurature?"); 
        final String mon = scanner.next();
        System.out.println("What is Tuesdays's tempurature?");
        final String tues = scanner.next(); 
        System.out.println("What is Wendsdays's tempurature?");
        final String wed = scanner.next(); 
        System.out.println("What is Thursdays's tempurature?");
        final String thur = scanner.next(); 
        System.out.println("What is Fridays's tempurature?");
        final String fri = scanner.next(); 
        System.out.println("What is Saturdays's tempurature?");
        final String sat = scanner.next(); 

        System.out.println("Your weekly calender is : \n Sunday" + sun + "\n Monday:" + mon + "\n Tuesday:" + tues + "\n Wednsday:" + wed + "\n Thursday:" + thur + "\n Friday:" + fri + "\n Saturday:" + sat); 

        final int intsun = Integer.parseInt(sun);
        final int intmon = Integer.parseInt(mon);
        final int inttues = Integer.parseInt(tues);
        final int intwed = Integer.parseInt(wed); 
        final int intthur = Integer.parseInt(thur);
        final int intfri = Integer.parseInt(fri);
        final int intsat = Integer.parseInt(sat);

        int average = 0; 
        
        average = (intsun + intmon + inttues + intwed + intthur + intfri+ intsat)/7 ; 
        
        System.out.println("The average tempurature for the week is " + average); 
        
    }

}
