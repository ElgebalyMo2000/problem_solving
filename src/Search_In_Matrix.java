import java.util.Scanner;
public class Search_In_Matrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean isContain = false;
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix   =new int[rows][col];
        for(int i = 0 ;i<rows ; i++){
            for(int j =0 ;j<col ;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the number");
        int num =sc.nextInt();
        for(int i = 0 ;i<rows ; i++){
            for(int j =0 ;j<col ;j++){
                if(num ==matrix[i][j]){
                    isContain = true;
                    break;
                }
            }          
        }
        if(isContain==true){
            System.out.println("will not take number");
        }
        else{
            System.out.println("will take number");
        }
    }
}
