import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a;
        int b;

        System.out.print("a = ");
        a = in.nextInt();

        System.out.print("b = ");
        b = in.nextInt();

        if (a > b) {
            System.out.println("a > b");
        }
        else if (a < b){
            System.out.println("a < b");
        }
        else {
            System.out.println("a = b");
        }

        int sum = a + b;
        int dif = a - b;
        int mul = a * b;
        double div = (double)a / b;

        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + dif);
        System.out.println("a * b = " + mul);
        System.out.println("a / b = " + div);
    }
}
