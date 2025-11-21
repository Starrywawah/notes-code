/*‼️do not run this terminal‼️
‼️this is just a syntax note‼️
the rest of the explanation will be in google document👍
*/


#include <stdio.h> //=> input/output import (exp : print() & scanf())
#include <math.h> //=> all compute problems (swrt(), pow(), sin(), etc)  ||  (check in the library/in my document note)
#include <string.h> //=> string handling (strcpy(), strlen(), strcmp)
#define constant 1 //=> form a macro constant 
#include <stdlib.h> //=>
#include <windows.h> //=>


int main(){ //function
    char variable;
    printf("Hello world!\n"); //output print in words
    printf("\n is for new line"); // explanation about \n
    printf("\t is for tab"); // explanation about \t
    
    return 0; //end point
} //brackets

int main(void){ //the newer gen that we usually use now

    printf("Hello world! %.2f", variable); //if variable has an input using scanf, during printf no need to us '&' on the left side
}

//variables
int a = 2; //interger
float b = 2.3; //decimals --> eats 16 bit
double x = 4.5; //decimals (more accurate) --> eats 24 bits (?)
char c [30]//character, not work for calc bcs binary
//[int] = max of how many character words

char name[] = "mizuki"; //string or array
/*‼️char in calculation will appear as ASCII character bcs 
the object is used for a binary number */

scanf("%something", &variable);
//%d = interger
//%f = float/double
//%.2f = float/double with 2 decimals places
//%lf = double
//%c = character
//%.2f = printing float (?)

    if (condition)
    {
        /* code */
    }

        else if (condition)
        {
            /* code */
        }

    else
    {
        /* code */
    }
    
    while (condition)
    {
        /* code */
    }

    for (size_t i = 0; i < count; i++)//must add int i to make i defined in code 
    {
        /* code */
    }


