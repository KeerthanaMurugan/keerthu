import java.lang.*;
import java.util.*;
class Reverse{
public static void main(String[]arg)
{
Scanner ss=new Scanner(System.in);
String s=new String();
StringBuffer s2=new StringBuffer();
s=ss.nextLine();
StringBuffer s1=new StringBuffer(s);
s2=s1.reverse();
System.out.println(s2);
}}