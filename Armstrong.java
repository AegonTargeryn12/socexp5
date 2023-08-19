import java.util.*;

class Armstrong
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 
System.out.print("Enter your number : ");
 int x=sc.nextInt();
 int r;
int sum=0;

for(int j=0;j>=999;j++)
{
 int n=x;

for(int i=1;i<4;i++)
{
  r=n%10;
  n=n/10;
  sum=sum+(r*r*r);

if(sum==x)
System.out.println(x+" is armstrong");
else
System.out.println(x+" is not armstrong");
}
}
}
}


 