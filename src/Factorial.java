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
        int fact = factorial(x);
        if(fact %2 ==0)
         System.out.println("YES");
        else
         System.out.println("NO");
       /*   Another Solution */
       System.out.println("/**********************    Another Solution  **********************/  ");
       int number  = scanner.nextInt();
       int result = 1;
       for(int i = 1 ; i<=number ; i++){
            result = result*i;
       }
       System.out.println("factorial of "+number+" = "+result);
       /*   Another Solution */
        System.out.println("/**********************    Another Solution2  **********************/  ");
        long n  = scanner.nextLong();
        if(n==1)
          System.out.println("NO");
        else
          System.out.println("YES");

       
    }
   

}
