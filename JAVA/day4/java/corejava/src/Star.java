import java.util.Scanner;
class Star{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Size of star");
         int  n=sc.nextInt();
         for(int i=1;i<=n;i++){
             for(int j=1;j<n-1;j++)
             {
              System.out.println(" ");
             }
             
             for(int j=n;j>=1;j--)
             {
              System.out.println("*");
             }
}          
sc.close();

}}