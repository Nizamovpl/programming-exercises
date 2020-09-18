// A microwave oven manufacturer recommends that when heating two items, add 50% to the heating time,
// and when heating three items double the heating time. Heating more than three items at once is not recommended.

// Write a program that asks the user for the number of items and the single-item heating time. 
//The program then writes out the recommended heating time.

// The user enters an integer for the heating time. 
//Any value under 100 is the number of seconds to heat. 
//A value 100 or higher shows seconds as the last two digits and minutes and the higher digits. So 100 means 1:00 (one minute zero seconds), 134 means 1:34 (one minutes 34 seconds), 1238 means 12:38 (twelve minutes 38 seconds), and so on.

// Allow the user to enter values like 389 (three minutes 89 seconds).

// First translate the value that the user entered into seconds. 
//Then use four successive single-branch if statements each of which tests for one of the four cases: 1 item, 2 items, 3 items, 
//more than three items. Look at the sports car purchase program in the chapter to see how to do this, if you are stuck.

// After determining the seconds of heating time, translate into minutes and seconds and print out that recommended time. 
//Integer division and remainder (/ and %) will be useful here.

// C:\Source> java Microwave
// How many items to heat: 1
// Time for one item: 34
// Heat for 0 minutes 34 seconds
// C:\Source> java Microwave
// How many items to heat: 2
// Time for one item: 34
// Heat for 0 minutes 51 seconds
// C:\Source> java Microwave
// How many items to heat: 3
// Time for one item: 120
// Heat for 2 minutes 40 seconds