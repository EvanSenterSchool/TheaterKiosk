import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int personAge;
        int wristBand_Min_Age = 21;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age.");

        if (scan.hasNextInt()) {

            personAge = scan.nextInt();
            if (personAge > 0 && personAge < 120) {

                if (personAge >= wristBand_Min_Age) {
                    System.out.println("You get a wristband");
                }
                else {
                    System.out.println("You are not old enough");
                }
            }
            else
                System.out.println("You did not enter a valid age");


        }
        else
            System.out.println("You have entered the wrong data type");
    }
}