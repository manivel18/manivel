#include<stdio.h>
#include<conio.h>
void main()
{
int n,i,s=0,r,t;
printf("\n enter the values:");
scanf("%d",&n);
t=n;
while(n>0)
{
r=n%10;
s=s+(r*r*r);
n=n/10;
}
if(t==s)
{
printf("\n armstrong:");
}
else
{
printf("\n not a armstrong:");
}
}

