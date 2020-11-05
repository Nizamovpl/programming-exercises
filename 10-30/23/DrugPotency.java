public class DrugPotency{
    public static void main(String[] args){

        float effective = 100; 
        float percent = 4; 
        float percentDecrease = (100 - percent)/100; 
        int month = 0; 

        while(effective > 50){
            effective = effective * percentDecrease; 
            month +=1; 
            System.out.println("Month: " + month + "      effectivness" + effective); 
        }

        if(effective < 50){
            System.out.println("DISCARDED"); 
            System.exit(1); 

        }

    }



}