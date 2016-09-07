import java.lang.*;
import java.util.*;
class Revint{
public static void main(String[] arg){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=0;
while(n!=0){
a=n%10;
System.out.print(a);
n=n/10;
}}}