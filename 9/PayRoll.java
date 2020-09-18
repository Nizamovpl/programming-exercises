// Examine this program (from the chapter):

public class PayRoll{  
  public static void main ( String[] args ) {
    long   hoursWorked = 40;    
    double payRate = 10.0, taxRate = 0.10;    
    System.out.println("Hours Worked: " + hoursWorked );
    System.out.println("pay Amount  : " + (hoursWorked * payRate) );
    System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
  }
}
// Modify it so that each variable is declared by itself and is not initialized. Next write three assignment statements to assign a value to each variable. Run the program; examine the output.

// Now let's break something: Remove one of the declarations from the program. Can you compile it?

// Now remove one of the initializations from the correct program. 
//(For example, delete the characters "= 40" from the first declaration. Try to compile and run the program. When is a problem detected?

//notes for a reminder as to what breaks it and what doesn't