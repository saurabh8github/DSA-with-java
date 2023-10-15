#Variables in java
---------------------
a=10, b=3

variable=> kind of container whoes values can be changed or vary

literal => whoes value cant be changed are literals like 1,2,3,4....

character litterals => "#", "*", "%".....


#define the variable
---------------------
type_of_var  name_of_var= value;

#here the value of the varialbe is assign to it's name


#all name's in java are known as identiffires



#Comments in java
---------------------

// for single line comment

/*this is multi line comments*/


#Inputs in java 
----------------------

=>to take input a single characcter in java use 

Scanner scn =new Scanner(System.in);
String input = scn.next();
System.out.println(input);


=>but if you want to take a paragraph or a string as input then use 

    String name = scn.nextLine();

 => integer input

    int number= scn.nextInt();

 =>same for other like for float

    float price = scn.nextFloat();

=>some more input

    nextByte();
    nextDouble();
    nextBoolean();
    nextShort();
    nextLong();

#Whenever we write any decimal values like 3.14 java take it as double to take it as float we used to write f at the end of the double value for eg.
3.14f this is now float


#Type conversion in java
---------------------------
    1.it only happen's when the type are comatible
    eg. int->float not int ->boolean

    2. Destination type should > source type

    eg int to long is possible but long to int is not 
___________________________
//this is possible
    int a=25;
    long b=a;
___________________________
//this is not because size of int is 4 byte and size of long is 8 byte

    long a=25;
    int b= a;
___________________________

byte->short->int->float->long->double
//this is the implecit conversion or widning convertion 

#if the order has changed then it became losy convertion which not allowed in java


#Type Casting
---------------------------
to forcefully convert the type of variable we use it 
in this programmer do lossy conversion

 =>this is known as narrowing or explisit convertion

    ref. JavaTypeCasting.java

=>type convertion of character  are possible in java


#Type promotion
--------------------------

    java automatically promot each byte, short, or char operand to int when evluating an expression.

    for eg. if char a='a';
                short b= 50;
                sum=a+b;
    then it will first convert a&b into int value then it will be added

    if one operand is long float or double the whole expression is promoted to long float pr double respectively

    eg.
    int a=10;
    float b=20.34f;
    long c=25;
    double d= 30;
    double ans = a+b+c+d;
    will print 85.25


#jre
------
java runtime environment

sc->compiler->byte code(.class)->jvm(java virtual machine)->native code

java is a portable language but c++ is not





