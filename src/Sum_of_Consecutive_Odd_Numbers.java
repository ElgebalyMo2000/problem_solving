import java.util.Scanner;
public class Sum_of_Consecutive_Odd_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int max,min;
        int sum=0;
        for(int i=0;i<size;i++){
            int val1 = sc.nextInt();
            int val2 = sc.nextInt();
            if(val1>val2){
               max = val1;
               min= val2;
            }
            else{
               min = val1;
               max=val2;
            }
            for(int j = 1+min ; j<max;j++){
                if(j%2==0){
                    continue;
                }
                else{
                    sum+=j;
                    System.out.print(j+" ");
                }
               
            }
             System.out.print(" sum= "+sum);
             System.out.println();
             sum=0;
        }
    }
}
