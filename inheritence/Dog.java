public class Dog{

    private String name,breed; 
    private int age; 

    public Dog(String name, String breed, int age){
        this.name = name; 
        this.breed = breed; 
        this.age = age; 
    }
  
    private boolean isEat = false;
    private boolean isplay = false; 
    private  boolean isSleep = false; 
    
    public void eat(){
        isEat = true; 
    }

    public void play(){
        isplay = true; 
    }

    public void sleep(){
        isSleep = true; 
    }

    public String bark(){
        return "bark"; 
    }

    public boolean hasEaten(){
        return isplay; 
    }

    public Boolean hasPlayed(){
        return isplay; 
    }

    public Boolean hasSlept(){
        return isSleep; 
    }

    public Boolean isHappy(){

        if(isEat || isSleep || isplay){
            return true; 
        }else{
            return false; 
        }
    }

}