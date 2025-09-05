import java.util.Scanner;
public class Average{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);   
System.out.println("enter the 5 number\n");
int a1=sc.nextInt();
int a2=sc.nextInt();
int a3=sc.nextInt();
int a4=sc.nextInt();
int a5=sc.nextInt();
 int avg;
 avg=(a1+a2+a3+a4+a5)/5;
 System.out.println("avg of the number is %d:"+ avg);
sc.close();
   
}
}