public class ArrayPractice{
    public static void main(String[] args){
        System.out.println("Hip, hip, h-array"); 

        // int x1 = 0; 
        // int x2 = 5; 
        // int x3 = 8; 
        
        
        int x = 10; 
        //only one type of data in an array
        int[] numbers = new int[x]; //arrays need a size when created 
        //cannot change size of arrays
        numbers[0] = 1; 
        numbers[0] +=2; 
        int y = numbers[0] - 1; 

        System.out.println(numbers[0]);
        
        int j = 0; 
        while(j < numbers.length){
            System.out.println(numbers[j]); 
            j++; 
        }

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]); 
        }

        //            0 1 2 3 4 5 6 
        int[] nums = {3,4,8,9,9,10}; 

        int numNines = 0; 

        for(int i = 0; i <nums.length; i++){
            if(nums[i] == 9){
                numNines++; 
            }
        }
        System.out.println(numNines); 

        //for each loop
        for(int num: nums){
            int(num ==9){
                numNines++; 
            }
        }

        //assuptions 
        // *touch all elements
        // *one by one
        // *front to back
        // *array cannot change mid loop
    }


}