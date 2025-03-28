import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a;
        String b;

        System.out.print("a = ");
        a = in.nextLine();

        System.out.print("b = ");
        b = in.nextLine();

        if (a.equals(b)) {
            System.out.println("The strings are identical");
        }
        else {
            System.out.println("The strings are not identical");
        }
    }
}

