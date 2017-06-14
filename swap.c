#include<stdio.h>
#include<conio.h>
void main()
{
int a,b;
printf("\nenter the values of a and b:");
scanf("\n%d%d",&a,&b);
a=a+b;
b=a-b;
a=a-b;
printf("values of a and b after swapping:%d %d",a,b);
}
