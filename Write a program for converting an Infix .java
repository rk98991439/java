Write a program for converting an Infix Expression to Postfix Expression

Algorithm:
  

a+b-c*d = abcd*-+.

#include<stdio.h>
#include<string.h>
char stack[50];
int top=-1;
void post(char infix[]);
void push(char);
char pop();

void main()
{
    char infix[25];
    printf("\nENTER THE INFIX EXPRESSION = ");
    gets(infix);
    post(infix);
    getch();
}

void push(char symb)
{
    if(top>=49)
    {
          printf("\nSTACK OVERFLOW");
         getch();
         return;
    }
    else
    {
          top=top+1;
         stack[top]=symb;
    }
}
char pop()
{
     char item;
     if(top==-1)
     {
            printf("\nSTACK IS EMPTY");
            getch();
            return(0);
      }
      else
     {
            item=stack[top];
            top--;
     }
     return(item);
}
int preced(char ch)
{
      if(ch==47)
      {
             return(5);
      }
      else if(ch==42)
      {
            return(4);
      }
      else if(ch==43)
      {
             return(3);
      }
      else
      return(2);
}
void post(char infix[])
{
      int l;
      int index=0,pos=0;
      char symbol,temp;
      char postfix[40];
      l=strlen(infix);
      push('#');
      while(index<l)
      {
             symbol=infix[index];
             switch(symbol)
             {
                    case '(': push(symbol);
                    break;
                    case ')': temp=pop();
                    while(temp!='(')
                    {
                            postfix[pos]=temp;
                            pos++;
                            temp=pop();
                    }
                    break;
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                    case '^':
                    while(preced(stack[top])>=preced(symbol))
                    {
                            temp=pop();
                            postfix[pos]=temp;
                            pos++;
                    }
                    push(symbol);
                    break;
                    default: postfix[pos++]=symbol;
                    break;
            }
            index++;
      }
      while(top>0)
      {
               temp=pop();
               postfix[pos++]=temp;
      }
       postfix[pos++]='\0';
       puts(postfix);
       return;
}




















Initialize the Stack.
Scan the operator from left to right in the infix expression.
If the leftmost character is an operand, set it as the current output to the Postfix string.
And if the scanned character is the operator and the Stack is empty or contains the '(', ')' symbol, push the operator into the Stack.
If the scanned operator has higher precedence than the existing precedence operator in the Stack or if the Stack is empty, put it on the Stack.
If the scanned operator has lower precedence than the existing operator in the Stack, pop all the Stack operators. After that, push the scanned operator into the Stack.
If the scanned character is a left bracket '(', push it into the Stack.
If we encountered right bracket ')', pop the Stack and print all output string character until '(' is encountered and discard both the bracket.
Repeat all steps from 2 to 8 until the infix expression is scanned.
Print the Stack output.
Pop and output all characters, including the operator, from the Stack until it is not empty.
Let's translate an infix expression into postfix expression in the stack:

Example:

Here, we have infix expression (( A * (B + D)/E) - F * (G + H / K))) to convert into its equivalent postfix expression:

jll









