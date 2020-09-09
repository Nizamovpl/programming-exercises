import java.util.Scanner;

//Boring one in case my other one fails
public class WeekTemp{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 

        System.out.println("What is Sunday's tempurature?"); 
        String sun = scanner.next(); 
        System.out.println("What is Mondays's tempurature?"); 
        String mon = scanner.next();
        System.out.println("What is Tuesdays's tempurature?");
        String tues = scanner.next(); 
        System.out.println("What is Wendsdays's tempurature?");
        String wed = scanner.next(); 
        System.out.println("What is Thursdays's tempurature?");
        String thur = scanner.next(); 
        System.out.println("What is Fridays's tempurature?");
        String fri = scanner.next(); 
        System.out.println("What is Saturdays's tempurature?");
        String sat = scanner.next(); 

        System.out.println("Your weekly calender is : \n Sunday" + sun + "\n Monday:" + mon + "\n Tuesday:" + tues + "\n Wednsday:" + wed + "\n Thursday:" + thur + "\n Friday:" + fri + "\n Saturday:" + sat); 
        
    }




}

//tempurature measured to the nearest degree are entered
//boring method in case the advanced one fails



// import java.util.Scanner;

// public class HelloWorld {  //always there. the argument has to match the file name
//     public static void main(String[] args){

//         Scanner scanner = new Scanner(System.in); //2nd scanner is a variable

//         System.out.println("Hello World!:>");
//         System.out.println("\t and no you aren't getting my schedule because I am lazy. <-< Why do you want it anyways.");  
        
//         System.out.println("What's ur name");

//         String placeholder = scanner.next(); 
//         System.out.println("Hello " + placeholder); 
//     }

// }