import java.util.Scanner; 

public class CollegeAdmission {
        
        public static void main(String[] args){
            int sat; 
            int classRank; 
            int awards; 
            String residence; 
            String lastName; 
            /////////
            int elite = 0; 
            int solid = 0; 
            int acceptable = 0; 
            int nope = 0; 
            ///////
            Scanner scanner = new Scanner(System.in); 
            System.out.println("WHat is your SAT score"); 
            sat = scanner.nextInt(); 
            System.out.println("What is your class rank precentile?"); 
            classRank = scanner.nextInt(); 
            System.out.println("What is your number of awards?");
            awards = scanner.nextInt(); 
            System.out.println("What is your residence");
            residence = scanner.next(); 
            System.out.println("What is your last name?"); 
            lastName = scanner.next(); 


            scanner.close(); 
            //////
            if (sat >= 1500){
                elite += 1; 
            }else if(sat > 1399){
                solid += 1; 
            }else if(sat > 1199){
                acceptable +=1; 
            }else{
                nope += 1; 
            }

            if (classRank >= 95){
                elite += 1; 
            }else if(classRank >= 90){
                solid += 1; 
            }else if(classRank >= 85){
                acceptable +=1; 
            }else{
                nope += 1; 
            }

            if (awards >= 10){
                elite += 1; 
            }else if(awards >= 7){
                solid += 1; 
            }else if(awards >= 3){
                acceptable +=1; 
            }else{
                nope += 1; 
            }

            if(residence.equals("Colorado")){
                elite +=1; 
            }else if(residence.equals("Florida")){
                nope +=1; 
            }else{
                acceptable +=1; 
            }

            if(elite >= 2 || solid > 2 && lastName.equals("Padjen") && acceptable <= 0 && nope <=0){
                System.out.println("You have been accepted to Pajen university"); 
            }else{
                System.out.println("nope"); 
            }





        }
        



}