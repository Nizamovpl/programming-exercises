public class Time(){
    //variables
    private int hour, minute, second = 0; 
    privat boolean isAm = true; 

    //constructor
    public Time(int hour, int minute, int second, boolean isAm){
        this.hour = hour; 
        this.minute = minute; 
        this.second = second; 
        this.isAm = isAm; 
        //you can set them to outervariables but it's harder to read
    }

    public Time(){
        this.hour = 0; 
        this.minute = 0; 
        this.second = 0; 
        this.isAm = true; 
        //you can set them to outervariables but it's harder to read
    }

    public int getHour() { //getter
        return hour; 

    }

    public void setHour(int hour){ //setter
        if (hour >= 0 && hour <+ 23) //idiot protecter
        this.hour = hour; 

    }

    //write the other two setMinte, and setSecond

    public void setMinute(int minute){
        this.minute = minute; 
    }

    public void setSecond(int second){
        this.second = second; 

    }

    public void display(){
        System.out.println(createDisplay()); 
    }

    public String createDisplay(){
      return this.hour + "hour" + this.minute + "minte" + this.second + (this.isAm? "am" : "pm"); 
    }; 
    //getters and setters

    //abilities



}