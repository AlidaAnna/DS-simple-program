#include<stdio.h>
void main()
{
int a[50],i,n,*p,sum=0;
printf("Enter the limit:");
scanf("%d",&n);
p=a;
for(i=0;i<n;i++)
{
scanf("%d",a+i);
}
for(i=0;i<n;i++)
{
printf("%d",*(a+i));
sum=sum+*(a+i);
}
printf("Sum is %d:",sum);
}

