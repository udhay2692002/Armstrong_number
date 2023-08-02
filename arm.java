import java.io.*;

class arm
{
public static void main(String args[])
{

int p=0;
int num=13;
int temp=num;
int rem=0;

while(num>0)
{

rem=num%10;
p+=(rem*rem*rem);
num=num/10;

}

if(temp==p)
{
System.out.println("ARMSTRONG");
}
else
{
System.out.println("NOT ARMSTRONG");
}

}
}
