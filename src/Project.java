import java.util.Scanner;
public class Project {
    public static void main(String[] args) {
        //  Calculator project:
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Enter the values");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("0.exit\n1.sum\n2.sub\n3.multi\n4.div\n5.mod");
        int ch = sc.nextInt();
        switch (ch) {
            case 0:
                break;
            case 1:
                System.out.println("Sum of vales is " + (x + y));
                break;
            case 2:
                System.out.println("Subtraction of  values is " + (x - y));
                break;
            case 3:
                System.out.println("Multiplication of values is " + (x * y));
                break;
            case 4:
                System.out.println("Division of values is " + (x / y));
                break;
            case 5:
                System.out.println("Modulus of values is" + (x % y));
                break;
        }
    }
}