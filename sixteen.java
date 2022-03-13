//FIBONACCI SERIES IN JAVA
import java.io.*;
import java.util.*;

public class sixteen
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n0=0,n1=1,n2,i,n;
System.out.println("Enter numberdd");
n=s.nextInt();
System.out.println(n0+"\n"+n1);
for(i=2;i<n;i++)
{
n2=n1+n0;
System.out.println(n2);
n0=n1;
n1=n2;
}
}
}
/*INPUT - Enter number
          4
  OUTPUT -0
          1
          1
          2                */
       
          

