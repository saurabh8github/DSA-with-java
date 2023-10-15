**Actual parameters are used when afunction is to be called inside functioncall the parameters used are actual parameters

***the formal parameter are the the parameter used while the function definition

***function needs a memory and it takes it as call stack (related to recursion) 

***call stack is basic of recursion 

#Call by value in java

call by value whenever a function is passed a variable it is not an originle there is alway a copy of original value will be passed  


java always works on call by value


call by reference those function who are passed original values in c++ we use  call by reference

#function overloading
-----------------------
multiple function with the same name but different parameters

by using parameters:
sum of 2
    int sum(int a ,int b){
        return a+b;
    }
sum of 3
    int sum(int a ,int b, int c){
        return a+b+c;
    }
    function overloading only used to see number or type of parameters

    if i  use return type float and another one int it will give error

#function overload using data type

#logic for  converting binary to decimal 
=>let the number n= 101
    steps=>
            dec=0//this will be our final ans from the n i have to take it of the last digit 
            pow=0
            last digit(ld)=1

            dec=dec+[ld*2^pow]
                pow++;
            put this in a loop

#Scop of variable in java
 there are two types of scope in java 
    1 method scope  a particular va can be only used under a function in which it is defined not outside of the function

    2 block scope in under the function there is {} inside these curly braces if we define a var it cn be used inside it only not outside


