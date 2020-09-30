//I want to make a fancier GUI if I have the chance
//ahh I need to take care of myself sorry. :-: but now i have the basic syntax
//btw I'm on 3 hours of sleep

import java.util.Scanner; 

public class FantasyGame{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Character Name: "); 
        String name = scanner.next(); 
        System.out.println("Strength: ");
        int strength = scanner.nextInt(); 
        System.out.println("Health: ");
        int health = scanner.nextInt(); 
        System.out.println("Luck: ");
        int luck = scanner.nextInt();
        
        int total = strength + health + luck; 

        if (total > 15){
            System.out.println("your character"+ name + "Your character has been given the default stats"); 
            System.out.println("/n You have five health, five strength, and five luck");
            //I would set them to variables later down the line. But at the minute this is functional. 
            //It depneds on whether i go back to these 
            //if I wasn't tireddd add something like a restart button I guess
        }else{
            System.out.println("Your character stats are Strength   " + strength + "your character health   " + health + "your character luck" + luck);
            //do we have to do long lines or can we indent in the middle. What are the paramaters of brackets or whatever 
        }; 



    }


}