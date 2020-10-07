import java.util.Scanner; 

public class InRangeAdder{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is the low end of your range?"); 
            int low = scanner.nextInt();
            System.out.println("What is the high end of your range?"); 
            int high = scanner.nextInt(); 
            
            int userImput; 
            int in = 0; 
            int out = 0; 
 

            while(true){
                System.out.println("Enter Data: ");
                userImput = scanner.nextInt();  

                if(userImput == 0){
                    scanner.close(); 
                    System.out.println("Your sum of in range values is" + in);
                    System.out.println("Your sum of out of range values is" + out); 
                    System.exit(1);

                }else if(userImput > low && userImput < high){
                    in= in + userImput; 

                }else{
                    out = out + userImput; 
                }


            }

        }


}