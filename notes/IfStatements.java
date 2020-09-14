public class IfStatements {

    public static void main(String[] args) {
        int x = 3; 
        int y = 4; 

        boolean isAwesomeDay = true; 
        boolean shouldWork = x < y; 

        String name = "Percy"; 

        //psudeocode = structure, syntax, doesn't work yet
        // //conditional
        // if(condition){
        //     ... do something
        // }

        //condition - always needs to be a boolean

        if(shouldWork && isAwesomeDay) { //experssion
            //run when shouldWork  and isAwesomeDay is true, or evaulates as true

        }

        
        if(shouldWork || isAwesomeDay) { //experssion
            //run when shouldWork or isAwesomeDay is true, or evaulates as true

        }

        if(!shouldWork){
            //runs if shouldWork is false
        }
        
        //code smell - antipattern
        if(shouldWork == true){ //same with false
            //never do this //redundant(none needed)
            //don't do one quals sign ever, because it changes it to true
        }

        if (x < y && shouldWork){ //can evaulate inside the ()

        }

        //code smell - anti pattern

        //if( x< y && < z){ //need to have soething on the other side of the and/or

        //}

        //uses Pemdas and before or (and = multiplication or = division parenthisis to affect the order)
        //(Nots have preference over everything)

        //you don't need to use {} for one line of code/  could be an antipattern
        if(shouldWork) System.out.println(name);
        //curly braces are better overall 

        //if there are multiple blocks you can't do that

        if (shouldWork){

        }else{

        }

        if(shouldWork){
            //runs code A if trye
        }else if(isAwesomeDay){
            //runs code B ; not a as well uf a == trye
        }else{
            //oeihdcg final thing
        }

        //any object equality is not the same as primative equality because of storage

        //if(name = "Percy"){
            //does not work
        //}

        if (name.equals("Percy")){
            //have to do equals. 
        }
        //default value of null for strings
    }                                           
}