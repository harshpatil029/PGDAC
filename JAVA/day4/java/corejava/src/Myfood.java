import java.util.Scanner;
class Myfood{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int dosa=20;
   int poha=30;
   int tea=12;
   int padapav=18;
   int cofee=12;
   int samosa=15;
   int sum=10;
   boolean flag=false;
 System.out.println("enter 1 for dosa Enter 2 for poha  Enter 3 tea for tea  Enter 4 for vadapav Enter5 for cofee Enter 6 samosa  Enter 7 for buy");
  while(!flag){
  
   System.out.println("Enter the choice\n");
   switch( sc.nextInt() ) 
   {
     case 1 : {
             sum=sum+dosa;
              break;
             }
     case 2 :
          {
            sum = sum+poha; 
            break;
            }
      case 3:{
             sum=sum+tea;
              break;
             }
      case 4:{
             sum=sum+vadapav;
              break;
             }
     case 5:{
             sum=sum+cofee;
              break;
             }
     case 6:{
             sum=sum+samosa;
              break;
             }
    case 7:{
          flag=true;                
           }
     default: {
       System.out.println("plz enter valid choice");
      
            }
}
}
System.out.println("the final prize is:"+sum);
sc.close();
}
}