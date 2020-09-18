//I had no clue what the instructions were trying to say so here's my interepritation. 
//where you imput 3 x values into the quadratic equation; it gives the answer to all three
public class valToVar{
    public static void main(String[] args){
        double a = 1; 
        double b = 2; 
        double c = 1;
        //in the future arrays would cut down chonkiness
        //I would probably do it if it wasn't 4 am right now
        double x1 =2; ; 
        double x2 = 4; ; 
        double x3 = 5; 
        //ansewers
        //same here arrays
        double y1; 
        double y2; 
        double y3; 
        //theme of fancy comment breaks
        y1 = (Math.pow(x1,2) *a) + (b*x1) + c;
        y2 = (Math.pow(x2,2) *a) + (b*x2) + c;
        y3 = (Math.pow(x3,2) *a) + (b*x3) + c;
        //output
        System.out.println("The values are (in order of imput)" + y1+ y2+y3);  

    }


}
