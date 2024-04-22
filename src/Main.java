import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input value for x:");
        x = scanner.nextInt();

        if (x==5){
            System.out.println("x is 5");
        }
        else {
            System.out.println("x is not 5");
        }
        System.out.print("This prints no matter what");
        System.out.println("Just checking");
    }
}