import java.util.Scanner;

public class SlopeOfALine {

    /**
     * Calculates slope (y2-y1)/(x2-x1) of a line as long as x2 - x1 != 0
     *
     * @param x1 - x-coordinate of first point
     * @param y1 - y-coordinate of first point
     * @param x2 - x-coordinate of second point
     * @param y2 - y-coordinate of second point
     * @return - Different strings based on whether the line is vertical or not
     */
    public static String slope(int x1, int y1, int x2, int y2) {
        // update the line below to return a properly formatted string
        return "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x1:");
        int xuno = scan.nextInt();
        System.out.print("Enter y1:");
        int yuno = scan.nextInt();
        System.out.print("Enter x2:");
        int xdos = scan.nextInt();
        System.out.print("Enter y2:");
        int ydos = scan.nextInt();

        int y = (ydos - yuno);
        int x = (xdos - xuno);

        if (x != 0)
            return ("The line defined by the points " + "(" + x1 + "," + y1 + ") " + "and " + "(" + x2 + "," + y2 + ") " + "is a vertical line and the slope is " + y / x + ".");
        else
            return ("The line defined by the points " + "(" + x1 + "," + y1 + ") " + "and " + "(" + x2 + "," + y2 + ") " + "is a vertical line and the slope is undefined.");
    }
}
}
        {

    }

    public static void main(String[] args) {
        // Get input from the user (you will need to create a Scanner object)
        // Call and print the result of the slope method as shown in the instructions.

        }




