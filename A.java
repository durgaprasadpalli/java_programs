import java.util.Scanner;
class A
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
    int a,b,c,d,e,f,g;
      System.out.println("enter a value");
      a=s.nextInt();
      System.out.println("enter b value");
      b=s.nextInt();
      c=a+b;
      System.out.println("add:"+c);
      d=a-b;
      System.out.println("sub:"+d);
      e=a*b;
      System.out.println("mul:"+e);
      f=a/b;
      System.out.println("div:"+f);
      g=a%b;
      System.out.println("mod:"+g);
    }
  }
  