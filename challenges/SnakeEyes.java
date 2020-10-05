import java.util.Random; 
import java.util.Scanner; 

//percent of players that have more than four rolls
public class SnakeEyes{
    

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        Random random = new Random(); 
        
        boolean snakeEyes = false;         int i = 0; 
        int dice1; 
        int dice2; 
        int turns = 0; //rolls
        int score = 0; 
        int internalRoles =0; 
        int four = 0; 

        System.out.println("How many times do you want to run the sim");
        int simTime = scanner.nextInt(); 
        System.out.println(simTime); 
        scanner.close(); 

        
        while(simTime > i){ 
            
            while (!snakeEyes){ // player turn
                dice1 = random.nextInt(6);
                dice2 = random.nextInt(6);
                
                if (dice1 == 1 && dice2 == 1){
                    if (internalRoles > 4){
                        four +=1; 
                    }
                    snakeEyes = true; 
                }else{
                    turns +=1; 
                    internalRoles += 1; 
                    score = score + dice1 + dice2;     
                }
            }
            snakeEyes = false; 
            internalRoles =0;   
            i++;  
        }

        double avgScore = (double)score / simTime; //average score out of all the players
        double avgRolls = (double) turns / simTime; //average amount of rolls
        double fourOrMore = ((double)four/ simTime)*100; 

        System.out.println("The average score is: " + avgScore);
        System.out.println("The average amount of rolls is: " + avgRolls); 
        System.out.println("The average % of people that have more than rolls is: " + fourOrMore); 

      



    }




}