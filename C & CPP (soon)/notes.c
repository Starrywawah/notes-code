/*‼️do not run this terminal‼️
‼️this is just a syntax note‼️
‼️Not every library keywords are in this file so make sure to check on my document for library links‼️
the rest of the explanation will be in google document👍
*/


#include <stdio.h> //=> input/output import (exp : print() & scanf())

//other import stuffs :
#include <math.h> //=> all compute problems (swrt(), pow(), sin(), etc)  ||  (check in the library/in my document note)
#define constant 1 //=> form a macro constant 

#include <string.h> //=> string handling (strcpy(), strlen(), strcmp)
#include <windows.h> //=>


int main(){ //function
    printf("\nHello world! My name is \"Mizuki\" "); //output print in words
    // \n is for new line
    // \t is for tab
    // \a is alert, it produces a sound
    // \" double quote, from the example it'll appear as ....My name is "Mizuki" in terminal
    
    return 0; //end point
} //brackets

int main(void){ //the newer gen that we usually use now
    float variable_one;
    printf("Enter variable : ");
    scanf("%f", &variable_one);
    printf("Hello world! %.2f", variable_one); //if variable has an input using scanf, during printf no need to us '&' on the left side
}

//%d = interger
//%f = float/double
//%.2f = float/double with 2 decimals places
//%lf = double
//%c = single letter/character
//%s = single word

//variables
int a = 2; //interger
float b = 2.3; //decimals --> eats 16 bit
double x = 4.5; //decimals (more accurate) --> eats 24 bits (?)
char c [30]//character, not work for calc bcs binary
//[int] = max of how many character words

char name[] = "mizuki"; //string or array
/*‼️char in calculation will appear as ASCII character bcs 
the object is used for a binary number */

//if-else condition
    if (/*condition*/)
    {
        /* code */
    }

    else if (/*condition*/)
    {
        /* code */
    }   

    else
    {
        /* code */
    }


//while loop
    while (/*condition*/)
    {
        /* code */
    }

//do-while loop
    do(/*condition*/)
    { 
        /* code */
    }
        while(condition);


//for loop
    for (/*condition1*/; /*condition2*/; /*condition3*/) 
    {
        /* code */
    }

//switch statement
    switch (/*condition*/)
    {
        /* code */
    }
