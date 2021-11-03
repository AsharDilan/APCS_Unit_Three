import java.util.Scanner;
public class dateOfEaster {
    public static Boolean isValidYear(int year) {
        if (year >= 1900 && year <= 2099) {
            return true;
        }
        return false;
    }

    public static String dateOfEaster(int year) {
        int a = year % 19;
        int b = year % 4;
        int c = year % 7;
        int d = (19 * a + 24) % 30;
        int e = (2 * b + 4 * c + 6 * d + 5) % 7;
        int date = 22 + d + e;
        int datex;
        int datey;
        if (date > 31) {
            datex = date;
        } else {
            datex = date;
        }

        if (year != 1954 && year != 1981 && year != 2049 && year != 2076) {
            if (date <= 31) {
                return "Easter is on March" + date;

            }
            if (year != 1954 && year != 1981 && year != 2049 && year != 2076) {
                if (date > 31)
                    return "Easter is on April" + datex;
            }
            if (year == 1954 || year == 1981 || year == 2049 || year == 2076) {
                datey = datex - 7;
                return "Easter is on March" + datey;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a Year between 1900 and 2099:");
        int year = scan.nextInt();
        Boolean range = isValidYear(year);
        if (range) {
            String date = dateOfEaster(year);
            System.out.println("In " + year + date);
        } else {
            System.out.println("You have entered an invalid year");
        }
    }
}


