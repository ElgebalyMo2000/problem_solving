import java.util.Scanner;

public class Factorial {
     static int factorial(int x){
        if(x==1)
         return 1;
        else
         return x*factorial(x-1);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
       System.out.println(factorial(x));

       /*   Another Solution */
       System.out.println("/**********************    Another Solution  **********************/  ");
       int number  = scanner.nextInt();
       int result = 1;
       for(int i = 1 ; i<=number ; i++){
            result = result*i;
       }
       System.out.println("factorial of "+number+" = "+result);
        
       
    }
   

}
