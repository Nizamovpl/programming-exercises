import java.util.Random; 

public class Color{
    Random random = new Random(); 
    int green; 
    int red; 
    int blue; 
    int percentBright; 
    int brightChange = 0; //default 

    public Color(int green, int red, int blue){
        this.green = green; 
        this.red = red; 
        this.blue = blue; 


    }
    public Color(){

        public static int randomBlue(){
            int blue = random.nextInt(255); //random value 
            return blue; 
        }

        public static int randomGreen(){
            int blue = random.nextInt(255); //random value 
            return green; 
        }
        

        public static int randomRed(){
            int blue = random.nextInt(255); //random value 
            return red; 
        }
    }
    

    //rework structure
    public int brightness(){
        //change of colour
        brightChange = 0; //whatever value goes here
        int newBright = 0;  //random orogional colour change + random, will I need to store them in an array? 

        //if one of the randoms is 0, do not alter it else 
        return newBright; 

    }
 



    //brightness you add to the present value
    //show summary of the things
    //max and min values

    //rules: 
    //All testing code should be in a separate file with its own class (for example ColorTester.java) and only has a main function
    //Do not write any static functions in the Color class

    //extra credit: 
    //Colors can be created with a hex code String as well
    //By providing a different color, give back the color created by blending the current color and the other one


}



// public class Time(){
//     //variables
//     private int hour, minute, second = 0; 
//     privat boolean isAm = true; 

//     //constructor
//     public Time(int hour, int minute, int second, boolean isAm){
//         this.hour = hour; 
//         this.minute = minute; 
//         this.second = second; 
//         this.isAm = isAm; 
//         //you can set them to outervariables but it's harder to read
//     }

//     public Time(){
//         this.hour = 0; 
//         this.minute = 0; 
//         this.second = 0; 
//         this.isAm = true; 
//         //you can set them to outervariables but it's harder to read
//     }

//     public int getHour() { //getter
//         return hour; 

//     }

//     public void setHour(int hour){ //setter
//         if (hour >= 0 && hour <+ 23) //idiot protecter
//         this.hour = hour; 

//     }

//     //write the other two setMinte, and setSecond

//     public void setMinute(int minute){
//         this.minute = minute; 
//     }

//     public void setSecond(int second){
//         this.second = second; 

//     }

//     public void display(){
//         System.out.println(createDisplay()); 
//     }

//     public String createDisplay(){
//       return this.hour + "hour" + this.minute + "minte" + this.second + (this.isAm? "am" : "pm"); 
//     }; 
//     //getters and setters

//     //abilities



// }