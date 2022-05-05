import java.util.Scanner;
class Simple
{
public static void main(String[] args)
{
Scanner rs=new Scanner(System.in);
float p,r,si;
int t;
System.out.println("principle amount:");
p=rs.nextFloat();
System.out.println("rate of interest:");
r=rs.nextFloat();
System.out.println("time:");
t=rs.nextInt();
si=(p*r*t)/100;
System.out.println("Simple interest:"+si);
}
}