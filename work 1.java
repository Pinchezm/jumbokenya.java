package java_methods;
import java.util Scanner;
public class method{
public static void main(String[]args){
scanner scanner=new Scanner(System.in);
System.out.println("Enter three numbers:");
int num1=scanner.nextl nt();
int num2=scanner.nextl nt();
int num3=scanner.nextl nt();
 
int smalest=Math.min(num1,Math.min(num2,num3));
int largest=Math.min(num1,Math.max(num2,num3));
System.out.println("The smallest number:"+ smallest);
System.out.println("The largest number:"+largest)
}
}