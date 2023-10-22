import java.util.Scanner;
public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum = 0;
        for (int i=0;i<size;i++){
            int val = sc.nextInt(); 
            if(val == 0){
                System.out.println(0);
                continue;
            }
            while (val !=0){
                int num = val % 10;
                System.out.print(num + " ");
                val /= 10;
                sum +=num;
            }
            System.out.println("sum = "+sum);
            sum=0;
        }
    }
}
