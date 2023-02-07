import java.io.*;
import java.util.*;
class Temperature
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int temp=s.nextInt();
if(temp <0)
{
System.out.println("freezing weather");
}
if(temp <=10 && temp>0)
{
System.out.println("very cold weather");
}
if(temp <=20 && temp>10)
{
System.out.println("cold weather");
}
if(temp <=30 && temp>20)
{
System.out.println("normal in temperature");
}
if(temp <=40 && temp>30)
{
System.out.println("its hot");
}
if(temp >=40)
{
System.out.println("its very hot");
}
}
}