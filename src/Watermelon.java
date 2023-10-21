import java.util.Scanner;

public class Watermelon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = scanner.nextDouble();

        if(((weight % 2) ==0) && (weight >2))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
    }

