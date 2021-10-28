public class LoneTeen {

    // In the space below, write the loneTeen method. Make sure the signature matches
    // the one given in the instructions.
    public static Boolean loneTeen(int num1, int num2) {

        if (num1 <= 19 && num1 >= 13 && num2 < 13 || num2 > 19)

            return true;

        else if (num2>=13)

        return false;
    }