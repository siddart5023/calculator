import java.util.*;
 class Switchcal
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   char n=sc.next().charAt(0);
   int b=sc.nextInt();
  switch(n)
{
  case '+': 
System.out.println(a+b);
break;
case '*':
System.out.println(a*b);
break;
case '-':
 System.out.println(a-b);
break;
case '/':
System.out.println(a/b);
break;
case '%':
System.out.println(a%b);
break;


}
}
}
