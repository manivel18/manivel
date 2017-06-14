#include<stdio.h>
int main()
{
    int n,i,sum=0;
    clrscr();
    printf("\n enter a positive integer:\n");
    scanf("%d",&n);
    while(i<=n)
    {
        sum=sum+i;
          i++;
    }
        printf("%d",sum);
}

