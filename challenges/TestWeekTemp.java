//This is gonna fail. But This is to test if I could find a thing copy & pasting scanner.next

//decalare arrays first
//for loop for arrays

public class TestWeekTemp{
    public static void main(final String[] args){
        final Scanner scanner = new Scanner(System.in); 

        System.out.println("What is Sunday's tempurature?"); 
        final String sun = scanner.next(); 

        System.out.println("Your weekly calender is : \n Sunday" + sun + "\n Monday:" + mon + "\n Tuesday:" + tues + "\n Wednsday:" + wed + "\n Thursday:" + thur + "\n Friday:" + fri + "\n Saturday:" + sat); 

        final int intsun = Integer.parseInt(sun);

        int average = 0; 
         
        
        System.out.println("The average tempurature for the week is " + average); 
        
    }

}
