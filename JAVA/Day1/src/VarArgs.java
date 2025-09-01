public class VarArgs {
    public static void main(String[] args) {
        
        System.out.println("2 Args: "+sum(23,45));
        System.out.println("3 Args: "+sum(23,45, 46));
        System.out.println("Var Args: "+sum(23,45, 34, 765, 87));
    }
    
    public static int sum(int a, int b){
         System.out.println("2 Args: ");
        return a+b;
    }
    
    public static int sum(int a, int b, int c){
          System.out.println("3Args: ");
        return a+b+c;
    }
    
    public static int sum(int... a ){
        int result = 0;
        for(int i =0; i<a.length; i++){
            result += a[i];
        }
        return result;
    }
}