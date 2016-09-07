import java.lang.*;
import java.util.*;
class Fact{
public static void main(String[] arg){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i=1,f=1;
while(i<=n){
f*=i;
i++;
}
System.out.println("The factorial of the number is:"+f);
}}
