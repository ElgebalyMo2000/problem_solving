import java.util.Scanner;
public class SomeSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int res = 0;
        for(int i=1 ; i<=n ; i++){
            int val =i;     
            while(val!=0){
                int num = val %10;
                val = val/10;
                sum+=num;
            }
            if (sum >=a && sum<=b){
                res+=i;
            }
            sum = 0;
        }
        System.out.println(res);
        }
    }
