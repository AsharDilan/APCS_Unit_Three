import java.util.Scanner;

public class FindLargest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Prompt the user for two integer variables
        System.out.println("Please Enter the First Integer:");
        int a = scan.nextInt();
        System.out.println("Please Enter the Second Integer:");
        int b = scan.nextInt();
        // Create a series of if statements that will print which number is larger or if they are equal
        // Make sure your output matches the samples or the tests will not pass.
        boolean a1 = true;
        if (a > b) {
            System.out.println(a + " is larger than " + b);
        }
        boolean b1 = true;
        if (b > a) {
            System.out.println(b + " is larger than " + a);
        }
    }
}
