
When writting a function, theres some data that is gonna sit outside of it

the funciton is responsible for data

classes are a higher level of grouping, where it groups functions with data

public class Car{
    //data variables
    //functions
    //what are unique to the object yet they can change
    String make; //(company thta makes car)
    String model; //(version of car)
    int year; 
    int speed; //whatever data there is needed. Most cars have speed. 

    public void drive(){
    speed +=10;
    if (speed.equals(x)){
        gear +=1; 
    } 
    }     
}


typically used to model something

//acess it through methods/functions

//defaults to private variables: puts limits on how it's changed
//java enforces it the most

//can declare public inside a class but why would you

getter and setters are most common functions. 
