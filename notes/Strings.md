#Strings

Public methods on a class -> api
    Application programming interface

    *length
    *indexOf
    *substring
    *equals
    *compareTo --> ordering

lexigraphical --> alphabetical

compareTo -1, 0, 1
1 -> already in order
0 -> same in order
-1 -> out of order

Stack
--------------------------
one -> A
two -> C
String -> C

Heap
--------------------------
A -> "1"
B
C -> "1"

Links to the more useful string methods used: https://github.com/RameshMF/java-strings-api-guide

#colour code data

Mutable Object
Stack
----------------

main
-----------------
c -> A
x ->
-----------------
foo
color -> A
x -> 6 
-----------------

Heap
------------------
A red, green,blue
B
C -> "banana"
D - "BANANA"
//ints are not in heap


//the scope is not limited
String String = "banana"; 
Color c = newColor(0); 
foo(c);


public static void foo(Color color String string){
    color.setRed(200); 
    string.toUpperCase(); //not gonna change the data
}