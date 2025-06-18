/*public class A
{
public static void main(String[] args)
{
int rows=6;
int cols=6;
for(int i=1;i<rows;i++)
{
for(int j=0;j<cols;j++)
{
System.out.print("* ");
}
System.out.println();
}
}
}*/

/*public class A
{
public static void main(String[] args)
{
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(i+" ");
}
System.out.println();
}
}
}*/

/*public class A
{
public static void main(String[] args)
{
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(j+" ");
}
System.out.println();
}
}
}*/

/*public class A
{
public static void main(String[] args)
{
int num=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(num+" ");
num++;
}
System.out.println();
}
}
}*/

/*public class A
{
public static void main(String[] args)
{
int num=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(num+"\t");
num++;
}
System.out.println();
}
}
}*/

/*public class A
{
public static void main(String[] args)
{
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(num+"	");
if(num==9){
num=1;
continue;
}
num++;

}
System.out.println();
}
}
}*/

/*public class A
{
public static void main(String[] args)
{
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(num+"	");
num+=2;

}
System.out.println();
}
}
}*/

/*public class A
{
public static void main(String[] args)
{
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(j%2);

}
System.out.println();
}
}
}*/


/*import java.util.Scanner;
class A
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n-1;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(" *");
}
System.out.println();
}
}
}*/

/*import java.util.Scanner;
class A
{
public static void main(String[] args)
{
int n,even=2;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n-1;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(" "+even);
even+=2;
}
System.out.println();
even=2;
}
}
}*/

/*import java.util.Scanner;
class A
{
public static void main(String[] args)
{
int n;
String s="INDIA";
Scanner s1=new Scanner(System.in);
System.out.print("Enter the value:");
n=s1.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=0;j<i;j++)
{
System.out.print(s.charAt(j));
}
System.out.println();
}
}
}*/

/*import java.util.Scanner;
class A
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=2*n-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=2*i-1;k++)
{
System.out.print(" *");
}
System.out.println();
}
}
}*/
