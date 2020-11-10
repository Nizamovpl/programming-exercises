public class Time{
    // variables
    private int hour, minute, second = 0;
    private boolean isAM = true;

    // constructor(s)
    public Time() { //default
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
        this.isAM = true;
    }

    public Time(int hour, int minute, int second, boolean isAM) { //default
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.isAM = isAM;
    }

    // getter and setters
    public int getHour(){ //getter
        return hour;
    }
    public void setHour(int hour){
        if (hour >= 0 && hour <= 23){
            this.hour = hour;
        }
    }

    // abilities
    public void display(){
        System.out.println(toString());
    }

    public String toString(){
        return this.hour + ":" + this.minute + 
            ":" + this.second + " " + (this.isAM ? "am" : "pm");
    }
}

//notes taken by Arjun Iyer