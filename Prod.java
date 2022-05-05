import java.util.Scanner;
class Prod
{
public static void main(String[] args)
{
Scanner rs=new Scanner(System.in);
String pname;
int pno;
float pcost,pqty,bill;
System.out.println("product name:");
pname=rs.next();
System.out.println("product no:");
pno=rs.nextInt();
System.out.println("product cost:");
pcost=rs.nextFloat();
System.out.println("product quantity:");
pqty=rs.nextFloat();
bill =pcost*pqty;
System.out.println("product no:"+pno);
System.out.println("product name:"+pname);
System.out.println("product cost:"+pcost);
System.out.println("product quantity:"+pqty);
System.out.println("bill:"+bill);
}
}