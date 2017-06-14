#include<stdio.h>
#include<conio.h>
void main()
{
int i,factorial=1,b;
printf("\n enter the value of b:");
scanf("%d",&b);
for(i=1;i<=b;i++)
{
factorial=factorial*i;
}
printf("\n value is:%d",factorial);
}
